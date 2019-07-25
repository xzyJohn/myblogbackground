package com.xzy.myblogbackground.model;

public class Article {
    private Long id;
    private String articleName;
    private String articleDate;
    private String articleAuthor;
    private String articleRoute;

    public String getArticleRoute() {
        return articleRoute;
    }

    public void setArticleRoute(String articleRoute) {
        this.articleRoute = articleRoute;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public String getArticleDate() {
        return articleDate;
    }

    public void setArticleDate(String articleDate) {
        this.articleDate = articleDate;
    }

    public String getArticleAuthor() {
        return articleAuthor;
    }

    public void setArticleAuthor(String articleAuthor) {
        this.articleAuthor = articleAuthor;
    }
}
