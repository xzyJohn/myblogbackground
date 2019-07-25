package com.xzy.myblogbackground.service.impl;

import com.xzy.myblogbackground.mapper.ArticleMapper;
import com.xzy.myblogbackground.model.Article;
import com.xzy.myblogbackground.service.ArticleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleMapper articleMapper;

    @Override
    public List<Article> getArticleList() {
        return articleMapper.getArticleList();
    }
}
