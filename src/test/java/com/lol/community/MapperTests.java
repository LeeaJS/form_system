package com.lol.community;

import com.lol.community.DAO.AlphaDAO;
import com.lol.community.DAO.DiscussPostMapper;
import com.lol.community.DAO.UserMapper;
import com.lol.community.Service.AlphaService;
import com.lol.community.entity.DiscussPost;
import com.lol.community.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.assertj.ApplicationContextAssert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@SpringBootTest
//@ContextConfiguration：以CommunityApplication.class为配置类进行测试
@ContextConfiguration(classes = CommunityApplication.class)
@RunWith(SpringRunner.class)

/**
 * @author ljs
 * @version 1.0
 */
public class MapperTests {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Test
    public void testSelectUser(){
//        User user = userMapper.selectUserById(1);
//        System.out.println(user);
        User user = userMapper.selectUserByName("ljs");
        System.out.println(user);
    }

    @Test
    public void testInsertUser(){
        User user = new User();
        user.setId(3);
        user.setUsername("lisi");
        user.setPassword("123333");
        user.setSalt("777");;
        user.setEmail("444@outlook.com");
        user.setType(333);
        user.setStatus(1);
        user.setActivationCode("333");
        user.setHeaderUrl("http:111");
        user.setCreateTime(new Date());
        int i = userMapper.insertUser(user);
        System.out.println(i);
        System.out.println(user.getId());

    }

    @Test
    public void testSelectPosts(){

        List<DiscussPost> discussPosts = discussPostMapper.selectDiscussPosts(101, 0, 10);
        for (DiscussPost post:discussPosts) {
            System.out.println(post);
        }

        int i = discussPostMapper.selectDisscusPostRows(101);
        System.out.println(i);

    }




}
