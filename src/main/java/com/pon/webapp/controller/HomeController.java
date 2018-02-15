package com.pon.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pon.webapp.dao.ProductDAO;


@Controller
public class HomeController {
	
	@Autowired
	ProductDAO product;
	
	@RequestMapping("/")
	public String home(ModelMap model){
		
		model.addAttribute("data", product.findAll());
		return "demo/index";
	}
	@RequestMapping("/linklist")
	public String link(ModelMap model){
		model.addAttribute("data", "this is linklist");
		return "demo/linklist";
	}
}
