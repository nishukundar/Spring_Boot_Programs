package com.nischitha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class DemoController {

	@GetMapping("/demo2")
	public String getData(Model model) {
		model.addAttribute("msg", "Hello, Nischitha!!");
		int i=10/0;
		return "demo";
	}
	
	
//	@ExceptionHandler(value=Exception.class)
//	public String exceptionHandling(Exception e  ) {
//		System.out.println(e.toString());
//		System.out.println("------------------------");
//		System.out.println(e.getMessage());
//		System.out.println("------------------------");
//		e.printStackTrace();
//		System.out.println("------------------------");
//		
//		return "error";
	
	@GetMapping("/msg")
	public String message(Model model) {
		
		model.addAttribute("msg", "Bye, Good night!");
		return "demo";
	} 
	
	
	
}
