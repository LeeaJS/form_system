package com.lol.community.DAO;

import com.lol.community.entity.User;
import org.apache.ibatis.annotations.Mapper;


/**
 * @author ljs
 * @version 1.0
 */

@Mapper
public interface UserMapper {

    User selectUserById(int id);

    User selectUserByName(String name);

    User selectUserByEmail(String email);

    int insertUser(User user);

    int updateStatus(int id, int status);

    int updateHeader(int id, String headerUrl);

    int updatePassword(int id, String password);
}
