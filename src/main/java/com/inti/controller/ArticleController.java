package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entites.Article;
import com.inti.service.interfaces.IArticleService;

@RestController
@RequestMapping(value="/")
public class ArticleController {
	@Autowired
	IArticleService articleservice;
	
	@RequestMapping(value="article", method = RequestMethod.GET)
	public List<Article> findAll(){
		return articleservice.findAll();
	}
	
	@RequestMapping(value="article/{id_article}", method = RequestMethod.GET)
	public Article findOne(@PathVariable("id_article")Long id_article) {
		return articleservice.findOne(id_article);
	}
	@RequestMapping(value="article", method = RequestMethod.POST)
	public Article saveArticle(@RequestBody Article article) {
		return articleservice.save(article);
	}
	@RequestMapping(value ="article/{id_article}", method= RequestMethod.DELETE)
	public void deleteArticle(@PathVariable("id_article") Long id_article) {
		articleservice.delete(id_article);
	}
	@RequestMapping(value="article/{id_article}", method= RequestMethod.PUT)
	public Article updateArticle(@PathVariable("id_article") Long id_article,@RequestBody Article article) {
		Article currentArticle = articleservice.findOne(id_article);
		currentArticle.setLibelle(article.getLibelle());
		currentArticle.setStock(article.getStock());
		currentArticle.setPrix(article.getPrix());
		return articleservice.save(currentArticle);
}
}