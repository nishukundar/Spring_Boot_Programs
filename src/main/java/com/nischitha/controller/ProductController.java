package com.nischitha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nischitha.service.ProductService;

@Controller
public class ProductController {

	private ProductService productservice;
	
	public ProductController(ProductService productservice){
		this.productservice=productservice;
	}
	
	@GetMapping("/demo3")
	public String productReview(Model model) {
		model.addAttribute("msg", "This product is good");
		
		String s =null;
		s.length();		
		return "demo";
	}
	
	@GetMapping("/demo4")
	public String methC() {
		productservice.meth();
		return "demo";
	}
	
	
}
