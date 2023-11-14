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

	
	
	@RequestMapping(path = "/pre", method = RequestMethod.GET)
	public String pre() {
		return "renshuu";
	}
	@RequestMapping(path = "/pre2", method = RequestMethod.POST)
	public String pre2() {
		return "renshuu";
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
			return "renshuu";
		}
	
	@RequestMapping(path = "/kaisi", method = RequestMethod.POST)
	public String kari2(String start, Model model) {
		model.addAttribute("start", start);	
		System.out.println(start);
		return "renshuu3";
		
	}
}
