package com.nischitha.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(value=Exception.class)
	public String exceptionHandling(Exception e, Model model) {
		
		//logging why when exception occurred all details 
		
		String message = e.getMessage();
		model.addAttribute("message", message);
		return "errorView";
	}
	
}
