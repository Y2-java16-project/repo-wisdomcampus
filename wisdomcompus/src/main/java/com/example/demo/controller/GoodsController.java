package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.pojo.Goods;
import com.example.demo.service.GoodsService;

@Controller
@RequestMapping("/goods")
public class GoodsController {
	
	@Autowired
	private GoodsService goodsService;
	
	@GetMapping("/index")
	public String index(Model model) {
		
		//转发
		return "goods-index.html";
	}
	
	
	@GetMapping("/toIndex")
	public String toIndex(Model model) {
		return "view/index.html";
	}
}