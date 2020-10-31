package com.clapsql;

import com.clapsql.mapper.ArticleMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 鹏哥儿
 */
@SpringBootApplication
@MapperScan("com.clapsql.mapper")
public class TutorialApplication implements CommandLineRunner {
    private final ArticleMapper articleMapper;

    public TutorialApplication(ArticleMapper articleMapper) {
        this.articleMapper = articleMapper;
    }

    public static void main(String[] args) {
        SpringApplication.run(TutorialApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(articleMapper.getArticleByArticleId(10001));
    }
}
