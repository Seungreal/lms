package com.example.demo.services;

import java.util.List;

import com.example.demo.domains.ArticleDTO;
import com.example.demo.domains.ReplyDTO;

import org.springframework.stereotype.Component;
@Component
public interface ArticleService {
    public void writeArticle(ArticleDTO a);
    public void updateArticle(ArticleDTO a);
    public void deleteArticle(ArticleDTO a);
    public void writeReply(ReplyDTO r);
    public List<ArticleDTO> readArticleList();
    public ArticleDTO readArticle(int artId);
    public List<ReplyDTO> readReply(int artId);
}
