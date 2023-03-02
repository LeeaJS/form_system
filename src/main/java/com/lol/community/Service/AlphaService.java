package com.lol.community.Service;

import com.lol.community.DAO.AlphaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author ljs
 * @version 1.0
 */
@Service
public class AlphaService {
    @Autowired
    private AlphaDAO alphaDAO;

//    public AlphaService() {
//        System.out.println("实例化AlphaService");
//    }
//
//    @PostConstruct
//    public void init(){
//        System.out.println("初始化AlphaService");
//    }
//    @PreDestroy
//    public void destroy(){
//        System.out.println("销毁AlphaService");
//    }

    public String find() {
        return alphaDAO.select();
    }




}
