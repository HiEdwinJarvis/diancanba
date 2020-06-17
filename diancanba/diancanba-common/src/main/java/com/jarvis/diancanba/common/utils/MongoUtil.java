package com.jarvis.diancanba.common.utils;

/**
 * @Description:
 * @CreateDate: 2020/2/6 14:53
 * @UpdateUser: jarvis
 * @UpdateDate: 2020/2/6 14:53
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MongoUtil {
    private static MongoCollection<Document> userCollection = null;
    private static MongoClient client = null;
    private static String host = null;
    private static Integer port = null;
    private static String databaseName = null;
    private static String collectionName = null;

    static {
        try {
            //1、创建Properties对象来表示mongo.properties文件
            Properties prop = new Properties();
            //2、关联
            InputStream ins = MongoUtil.class.getClassLoader().getResourceAsStream("mongo.properties");
            prop.load(ins);
            //3、获取文件中的数据
            host = prop.getProperty("host");
            port = Integer.parseInt(prop.getProperty("port"));
            databaseName = prop.getProperty("databaseName");
            collectionName = prop.getProperty("collectionName");
            //4、关流
            ins.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取集合
     *
     * @return
     */
    public static MongoCollection<Document> getCollection() {
        //1、连接上MongoDB
        client = new MongoClient(host, port);
        //2、连接上指定的库
        MongoDatabase db = client.getDatabase(databaseName);
        //3、连上指定的集合
        userCollection = db.getCollection(collectionName);
        return userCollection;
    }

    /**
     * 关闭MongoDB的客户端
     */
    public static void close() {
        if (client != null)
            client.close();
    }
}

