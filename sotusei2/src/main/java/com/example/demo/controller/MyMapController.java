package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	
	
	
	//最初のページ
		@RequestMapping(path = "/mymap2", method = RequestMethod.GET)
		public String kari1() {
			return "renshuu2";
		}
	
	@RequestMapping(path = "/kaisi", method = RequestMethod.POST)
	public String kari2(String start, Model model) {
		model.addAttribute("start", start);	
		System.out.println(start);
		return "renshuu3";
		
	}







	@RequestMapping(path = "/mymap3", method = RequestMethod.GET)
	public String karikari() {
		return "renshuu2";
	}

@RequestMapping(path = "/kaisi3", method = RequestMethod.POST)
public String karikari2(String start, String goal,Model model) {
	model.addAttribute("start", start);	
	model.addAttribute("goal", goal);	
	System.out.println(start+goal);
	return "renshuu4";
	
}







}
