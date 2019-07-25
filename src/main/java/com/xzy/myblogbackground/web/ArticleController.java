package com.xzy.myblogbackground.web;

import com.xzy.myblogbackground.model.Article;
import com.xzy.myblogbackground.service.ArticleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Resource
    private ArticleService articleService;
    @GetMapping
    public List<Article> articleList(){
        List<Article> articleList=articleService.getArticleList();
        return articleList;
    }
}
