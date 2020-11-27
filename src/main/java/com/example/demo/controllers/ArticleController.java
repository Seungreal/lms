package com.example.demo.controllers;

import java.util.List;

import com.example.demo.domains.ArticleDTO;
import com.example.demo.domains.ReplyDTO;
import com.example.demo.imples.ArticleServiceImpl;
import com.example.demo.services.ArticleService;

import org.springframework.stereotype.Controller;
@Controller
public class ArticleController{
    ArticleService service = new ArticleServiceImpl();
    public void PostwriteArticle(ArticleDTO a){
        service.writeArticle(a);
    }
    public void putUpdateArticle(ArticleDTO a){
        service.updateArticle(a);
    }
    public void deleteArticle(ArticleDTO a){
        service.deleteArticle(a);
    }
    public void postWriteReply(ReplyDTO r){
        service.writeReply(r);
    }
    public List<ArticleDTO> getReadArticleList(){
        return service.readArticleList();
    }
    public ArticleDTO getReadArticle(int artId){
        return service.readArticle(artId);
    }
    public List<ReplyDTO> getReadReply(int artId){
        return service.readReply(artId);
    }
}