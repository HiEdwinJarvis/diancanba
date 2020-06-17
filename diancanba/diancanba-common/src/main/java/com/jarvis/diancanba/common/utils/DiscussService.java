package com.jarvis.diancanba.common.utils;

/**
 * @Description:
 * @CreateDate: 2020/2/6 15:02
 * @UpdateUser: jarvis
 * @UpdateDate: 2020/2/6 15:02
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
import org.bson.Document;
import java.util.List;

/**
 * 评论业务层接口
 */
public interface DiscussService {
    // 查询所有评论数据
    List<Document> findPageDiscuss(Integer page,Integer limit)throws Exception;
}
