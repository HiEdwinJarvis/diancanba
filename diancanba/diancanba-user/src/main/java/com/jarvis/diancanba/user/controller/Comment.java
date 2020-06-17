package com.jarvis.diancanba.user.controller;

import com.jarvis.diancanba.base.entity.Pinglun;
import com.jarvis.diancanba.base.entity.Result;
import com.jarvis.diancanba.common.utils.CookieUtil;
import com.jarvis.diancanba.common.utils.MongoUtil;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.hamcrest.core.IsCollectionContaining;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * @Description:
 * @CreateDate: 2020/2/6 18:52
 * @UpdateUser: jarvis
 * @UpdateDate: 2020/2/6 18:52
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@RestController
@RequestMapping("/comment")
public class Comment {

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private HttpServletResponse response;


    //评论
    @RequestMapping("/write")
    public Result write(String content,String name){

        String restaurantId = CookieUtil.getCookieValue(request, "restaurantId", "UTF-8");
        String IsComment = CookieUtil.getCookieValue(request, "IsComment", "UTF-8");

        System.out.println("IsCommetn="+IsComment);

        if(IsComment.equals("1")) {


            try {
                MongoCollection<Document> collection = MongoUtil.getCollection();

                Document document = new Document();
                Map map = new HashMap();
                map.put(name, content);
                document.append(restaurantId, map);
                collection.insertOne(document);


                CookieUtil.setCookie(request, response, "IsComment", "0", 3600 * 24, "UTF-8");

                return new Result(true, "评论完成");
            } catch (Exception e) {
                return new Result(false, "未知错误");
            }

        }else if(IsComment == ""){
            return new Result(false,"还未用餐，请勿恶意评价");
        }else {
            return new Result(false,"用餐一次只能评价一次");

        }
    }

    /*
    * 显示评论
    * */

    @RequestMapping("/show")
    public List<Pinglun> show(){

        String restaurantId = CookieUtil.getCookieValue(request, "restaurantId", "UTF-8");

        MongoCollection<Document> collection = MongoUtil.getCollection();

        FindIterable<Document> documents = collection.find();


        List<Pinglun> list = new ArrayList<Pinglun>();
        for(Document document1: documents){
            Set<String> strings = document1.keySet();
            for(String d : strings){

                if(d.equals(restaurantId)){

                    String str1 =  document1.get(restaurantId).toString().substring(10);
                    String str2 = str1.replace("}}"," ");
                    System.out.println(str2);
                    String[] split = str2.split("=");
                    Pinglun pinglun = new Pinglun();
                    pinglun.setName(split[0]);
                    pinglun.setContent(split[1]);
                    list.add(pinglun);



                }
            }



        }

        //倒序
        List<Pinglun> list1 = new ArrayList<Pinglun>();
        for(int i = list.size()-1 ; i>=0;i--){
            list1.add(list.get(i));
        }

        System.out.println("=====>"+list);


return list1;


    }
}
