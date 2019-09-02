package com.inti.service.interfaces;

import java.util.List;

import com.inti.entites.Article;

public interface IArticleService {
	public List<Article> findAll();

	public Article findOne(Long id_article);

	public Article save(Article article);

	public void delete(Long id_article);
}
