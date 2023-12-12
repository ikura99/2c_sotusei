package com.example.demo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyMapController {


	//最初のページ
	@RequestMapping(path = "/mymap", method = RequestMethod.GET)
	public String login() {
		return "mymap";
	}

	
	
	
	@RequestMapping(path = "/prepre", method = RequestMethod.GET)
	public String prepre() {
		return "prepre";
	}
	@RequestMapping(path = "/prepre", method = RequestMethod.POST)
	public String prepre_pos() {
		return "prepre";
	}
	
	
	
	
	





	@RequestMapping(path = "/mymap3", method = RequestMethod.GET)
	public String karikari() {
		return "renshuu2";
	}

@RequestMapping(path = "/kaisi3", method = RequestMethod.POST)
public String karikari2(String start, String goal,Model model, @RequestBody Map<String, String> formData) {
	model.addAttribute("start", start);	
	model.addAttribute("goal", goal);	
	model.addAttribute("formData", formData);
	System.out.println(start+goal);
	return "renshuu4";
	
}


@RequestMapping(path = "/mymap4", method = RequestMethod.GET)
public String karikari8888() {
	return "renshuu6";
}

@RequestMapping(path = "/kaisi4", method = RequestMethod.POST)
public String karikari28888(String start, String goal,Model model) {
model.addAttribute("start", start);	
model.addAttribute("goal", goal);	
System.out.println(start+goal);
return "renshuu5";

}




}
