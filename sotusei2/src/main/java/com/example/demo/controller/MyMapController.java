package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyMapController {


	//最初のページ
	@RequestMapping(path = "/mymap", method = RequestMethod.GET)
	public String login() {
		return "mymap";
	}

	
	
//開始地点、中継地点、終了地点完成
//いじらない!!!!!!!!!!!!!!!!!!
	@RequestMapping(path = "/mymap2", method = RequestMethod.GET)
	public String prepre() {
		return "prepre2";
	}
	@RequestMapping(path = "/kaisi2", method = RequestMethod.POST)
	public String prepre_pos(
	    String start,
	    String goal,
	    @RequestParam(value = "relay[]", required = false) String[] relayPoints,
	    Model model) {
		//required = falseでrelayPointsの中身が無くてもエラーが起きないようにしている
		model.addAttribute("start", start);	
		model.addAttribute("goal", goal);	
			
		System.out.println(start);
		System.out.println(goal);
		
		if (relayPoints != null) {
			for (int i = 0; i < relayPoints.length; i++) {
	            System.out.println("Relay Point " + (i + 1) + ": " + relayPoints[i]);
	        }
			model.addAttribute("relayPoints", relayPoints);
	    }
		
	
		return "renshuu3";
	}
	
	
	
	
	




//今いじってる
//現在点の取得
	@RequestMapping(path = "/mymap5", method = RequestMethod.GET)
	public String mymap5() {
		return "prepre";
	}
	@RequestMapping(path = "/kaisi5", method = RequestMethod.POST)
	public String kaisi5(
	    String start,
	    String goal,
	    @RequestParam(value = "relay[]", required = false) String[] relayPoints,
	    Model model) {
		//required = falseでrelayPointsの中身が無くてもエラーが起きないようにしている
		model.addAttribute("start", start);	
		model.addAttribute("goal", goal);	
			
		System.out.println(start);
		System.out.println(goal);
		
		if (relayPoints != null) {
			for (int i = 0; i < relayPoints.length; i++) {
	            System.out.println("Relay Point " + (i + 1) + ": " + relayPoints[i]);
	        }
			model.addAttribute("relayPoints", relayPoints);
	    }
		
	
		return "renshuu4";
	}



//開始地点と終了地点の検索完成
//いじらないやつ-----------------------------。
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
