package com.example.demo.imples;

import java.util.List;

import com.example.demo.domains.ArticleDTO;
import com.example.demo.domains.ReplyDTO;
import com.example.demo.services.ArticleService;

import org.springframework.stereotype.Service;
@Service
public class ArticleServiceImpl implements ArticleService {

    @Override
    public void writeArticle(ArticleDTO a) {
        // TODO Auto-generated method stub

    }

    @Override
    public void updateArticle(ArticleDTO a) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteArticle(ArticleDTO a) {
        // TODO Auto-generated method stub

    }

    @Override
    public void writeReply(ReplyDTO r) {
        // TODO Auto-generated method stub

    }

    @Override
    public List<ArticleDTO> readArticleList() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ArticleDTO readArticle(int artId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<ReplyDTO> readReply(int artId) {
        // TODO Auto-generated method stub
        return null;
    }
    
}