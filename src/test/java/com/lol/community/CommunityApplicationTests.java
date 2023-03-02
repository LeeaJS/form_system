package com.lol.community;

import com.lol.community.DAO.AlphaDAO;
import com.lol.community.Service.AlphaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.assertj.ApplicationContextAssert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
//@ContextConfiguration：以CommunityApplication.class为配置类进行测试
@ContextConfiguration(classes = CommunityApplication.class)


public class CommunityApplicationTests implements ApplicationContextAware {
    //用来记录容器
	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    //传入的applicationContext接口就是一个Spring容器
		this.applicationContext = applicationContext;
	}

	@Test
	public void testApplicationContext(){
		System.out.println(applicationContext);

		AlphaDAO alphaDAO = applicationContext.getBean(AlphaDAO.class);
		System.out.println(alphaDAO.select());

	}

	@Test
	public void testBeanManagement(){
		AlphaService alphaService = applicationContext.getBean(AlphaService.class);
		System.out.println(alphaService);
	}

	@Test
	public void testBeanConfig(){
		SimpleDateFormat simpleDateFormat =
				applicationContext.getBean(SimpleDateFormat.class);
		System.out.println(simpleDateFormat.format(new Date()));
	}

	@Autowired
	@Qualifier("AlphaDAOHibernate")
	public AlphaDAO alphaDAO; //Spring 可以将AlphaDAO注入到该属性，前面需要AutowireAutowired注解

	@Test
	public void testDI(){
		//测试依赖注入
		System.out.println(alphaDAO);
	}


}
