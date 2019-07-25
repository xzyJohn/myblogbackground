package com.xzy.myblogbackground.mapper;

import com.xzy.myblogbackground.model.Article;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ArticleMapper {
    @Select("select * from article")
    List<Article> getArticleList();
}
