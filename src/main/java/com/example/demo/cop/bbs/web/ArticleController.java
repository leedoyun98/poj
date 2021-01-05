package com.example.demo.cop.bbs.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.cmm.enm.Messenger;
import com.example.demo.cop.bbs.service.ArticleService;

@RestController
public class ArticleController {
	@Autowired ArticleService service;
	
	public Messenger art() {
		return (1 == 1) ?  Messenger.SUCCESS : Messenger.FAILURE;
	}
	
}
