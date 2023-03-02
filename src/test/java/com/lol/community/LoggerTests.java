package com.lol.community;

/**
 * @author ljs
 * @version 1.0
 */


import com.lol.community.DAO.AlphaDAO;
import com.lol.community.DAO.DiscussPostMapper;
import com.lol.community.DAO.UserMapper;
import com.lol.community.Service.AlphaService;
import com.lol.community.entity.DiscussPost;
import com.lol.community.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

public class LoggerTests {

    private static final Logger logger = LoggerFactory.getLogger(LoggerTests.class);

    @Test
    public void testLogger(){
        System.out.println(logger.getName());

        logger.debug("debug log");
        logger.info("info log");
        logger.warn("warn log");
        logger.error("error log");

    }
}
