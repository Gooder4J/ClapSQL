package com.clapsql.mapper;

import com.clapsql.pojo.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author 鹏哥儿
 */

@Repository
@Mapper
public interface ArticleMapper {
    /**
     * <p>通过articleId查询教程文章</p>
     * @param articleId
     * @return
     */
//    Article getArticleByArticleId(@Param("articleId") long articleId);
    Article getArticleByArticleId(long articleId);

    /**
     * <p>新增教程文章</p>
     * @param article
     * @return
     */
    Article addArticle(Article article);

    /**
     * <p>更新教程文章</p>
     * @param article
     * @return 受影响的行数（记得开启useAffectedRows=true）
     */
    int updateArticle(Article article);

    /**
     * <p>通过articleId删除文章</p>
     * @param articleId
     * @return
     */
    int deleteArticleByArticleId(long articleId);
}
