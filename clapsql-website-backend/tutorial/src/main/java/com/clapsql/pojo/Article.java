package com.clapsql.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author 鹏哥儿
 */
@Data
public class Article {
    long articleId;
    long userId;
    String title;
    String content;
    boolean status;
    Date createdTime;
    Date updateTime;
}
