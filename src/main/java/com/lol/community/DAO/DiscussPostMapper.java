package com.lol.community.DAO;

import com.lol.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ljs
 * @version 1.0
 */
@Mapper
public interface DiscussPostMapper {

    /**
     *
     * @param userId
     * @param offset
     * @param limit
     * @return 返回需要查询的评论
     */
    List<DiscussPost> selectDiscussPosts(int userId,  int offset, int limit);

    /**
     *
     * @param userId
     * @return 返回需要查询的评论行数
     * @Param注解 用于给参数取别名
     */
    int selectDisscusPostRows(@Param("userId") int userId);






}
