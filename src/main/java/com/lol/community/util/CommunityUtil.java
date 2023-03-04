package com.lol.community.util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.DigestUtils;

import java.util.UUID;

/**
 * @author ljs
 * @version 1.0
 */
public class CommunityUtil {

    // 生成一个随机字符串，用于验证码等功能
    public static String generateUUID(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    // MD5加密
    // 在密码后面添加一个随机字符串，然后再进行加密，安全性更高
    public static String md5(String key){

        if(StringUtils.isBlank(key)) {
            return null;
        }

        return DigestUtils.md5DigestAsHex(key.getBytes());

    }
}
