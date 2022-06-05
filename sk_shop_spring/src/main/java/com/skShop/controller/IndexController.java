package com.skShop.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.skShop.serviceInterface.GetManBest10;
import com.skShop.serviceInterface.GetTodayBest10;
import com.skShop.serviceInterface.GetWomanBest10;



/**
 * Handles requests for the application home page.
 */
@Controller
public class IndexController {
	
	@Autowired
	private GetTodayBest10 getTodayBest10;
	@Autowired
	private GetManBest10 getManBest10;
	@Autowired
	private GetWomanBest10 getWomanBest10;
	
	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Locale locale, HttpServletRequest req, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		getTodayBest10.service(req, model);
		getManBest10.service(req, model);
		getWomanBest10.service(req, model);
		return "index";
	}
	
}
