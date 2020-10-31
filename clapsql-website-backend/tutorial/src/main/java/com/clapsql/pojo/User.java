package com.clapsql.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author 鹏哥儿
 */

@Data
public class User {
    long userId;
    String username;
    boolean gender;
    String email;
    String phone;
    Date createdTime;
    Date updateTime;
}
