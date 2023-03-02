package com.lol.community.Service;

import com.lol.community.DAO.UserMapper;
import com.lol.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ljs
 * @version 1.0
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findUserById(int id){
        return userMapper.selectUserById(id);
    }
}
