package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
	public class GamenController {

		//最初のページ
		@RequestMapping(path = "/nyuuryoku", method = RequestMethod.GET)
		public String nyuuryoku() {
			return "nyuuryoku";
		}
		
		@RequestMapping(path = "/syuturyoku", method = RequestMethod.POST)
		public String syuturyoku(String departure,String destination, Model model) {
			model.addAttribute("syutu", departure);	
			model.addAttribute("moku", destination);	
			return "syuturyoku";
		}
}