package com.jarvis.diancanba.common.utils;

/**
 * @Description:
 * @CreateDate: 2020/2/6 15:03
 * @UpdateUser: jarvis
 * @UpdateDate: 2020/2/6 15:03
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;
public class DiscussServiceImpl implements DiscussService {

    @Override
    public List<Document> findPageDiscuss(Integer page, Integer limit) throws Exception {
        MongoCollection<Document> discussCollection = MongoUtil.getCollection();
        // 执行数据查询
        FindIterable<Document> documents = discussCollection.find();
        // 进行分页查询
        documents.skip((page - 1) * limit).limit(limit);
        // 新建一个list集合
        ArrayList<Document> list = new ArrayList<>();
        // 将查询的数据进行遍历输出，在加入到list集合中
        documents.iterator().forEachRemaining(temp -> System.out.println(list.add(temp)));

        return list;
    }
}
