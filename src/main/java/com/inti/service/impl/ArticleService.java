package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entites.Article;
import com.inti.repositories.ArticleRepository;
import com.inti.service.interfaces.IArticleService;

@Service
public class ArticleService implements IArticleService {
	
	@Autowired
	ArticleRepository articlerepository;

	@Override
	public List<Article> findAll() {
		return articlerepository.findAll();
	}

	@Override
	public Article findOne(Long id_article) {
		return articlerepository.findById(id_article).orElse(null);
	}

	@Override
	public Article save(Article article) {
		return articlerepository.save(article);
	}

	@Override
	public void delete(Long id_article) {
		articlerepository.deleteById(id_article);
		
	}

}
