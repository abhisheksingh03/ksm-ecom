package com.ksm.ecom.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ksm.ecom.service.EcomAppService;

@Controller
@RequestMapping("/")
public class EcomAppController {
	
	@Autowired
	 private EcomAppService ecomAppService;
  
	@RequestMapping(path="/ecom",method=RequestMethod.GET)
	private @ResponseBody String getAppDetails(Model model) {
		return new String("Welcome to app.........");
	}
	
	@RequestMapping(path="/ecom/app",method=RequestMethod.GET)
	private  String getAppForm(Model model) {
		model.addAttribute("tests", Arrays.asList("sinut","test","abc"));
		
		Arrays.asList("tes").forEach(s->{System.out.println(s);});
		return "ksm-home";
	}
	
	@RequestMapping(path="/ecom/dashboard",method=RequestMethod.GET)
	private  String getMenu(Model model) {
		model.addAttribute("tests", Arrays.asList("sinut","test","abc"));
		Arrays.asList("tes").forEach(s->{System.out.println(s);});
		ecomAppService.getAppData();
		return "ksm-dashboard";
	}
}
