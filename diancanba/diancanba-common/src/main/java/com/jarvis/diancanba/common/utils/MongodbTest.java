package com.jarvis.diancanba.common.utils;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

import java.util.*;

/**
 * @Description:
 * @CreateDate: 2020/2/6 15:01
 * @UpdateUser: jarvis
 * @UpdateDate: 2020/2/6 15:01
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class MongodbTest {
   /* public static void main(String[] args) {

        MongoCollection<Document> collection = MongoUtil.getCollection();
        Document document = new Document();
        Map map = new HashMap();
        map.put("好人","好评 ");
        document.append("2",map);
        collection.insertOne(document);





        FindIterable<Document> documents = collection.find();


        for(Document document1: documents){
            Set<String> strings = document1.keySet();
            for(String d : strings){

                if(d.equals("2")){

                    String str1 =  document1.get("2").toString().substring(10);
                    System.out.println(str1.replace("}}"," "));


                }
            }

            System.out.println();

        }



    }*/
}
