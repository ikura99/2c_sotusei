package com.example.demo.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class MyMapController {


	//最初のページ
	@RequestMapping(path = "/mymap", method = RequestMethod.GET)
	public String login() {
		return "a";
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
	@RequestMapping(path = "/result", method = RequestMethod.POST)
	public String result(String start, String goal, @RequestParam(value = "relay[]", required = false) String[] relayPoints, Model model, HttpSession session) {
		//required = falseでrelayPointsの中身が無くてもエラーが起きないようにしている
		  session.removeAttribute("start");
	        session.removeAttribute("goal");
	        session.removeAttribute("relayPoints");
		
		session.setAttribute("start", start);
		session.setAttribute("goal", goal);
		
		model.addAttribute("start", start);	
		model.addAttribute("goal", goal);	
		
		System.out.println(start);
		System.out.println(goal);
		
		if (relayPoints != null) {
			for (int i = 0; i < relayPoints.length; i++) {
	            System.out.println("Relay Point " + (i + 1) + ": " + relayPoints[i]);
	        }
			session.setAttribute("relayPoints", relayPoints);
			model.addAttribute("relayPoints", relayPoints);
	    }
		
	
		return "walking";//本当はrenshuu4
	}//driving walking transit
	
	@RequestMapping(path = "/driving", method = RequestMethod.GET)
	public String driving(HttpSession session, Model model) {
		//required = falseでrelayPointsの中身が無くてもエラーが起きないようにしている
		model.addAttribute("start", session.getAttribute("start"));	
		model.addAttribute("goal", session.getAttribute("goal"));	
		
		if (session.getAttribute("relayPoints") != null) {
			
			model.addAttribute("relayPoints", session.getAttribute("relayPoints"));
        }
	
		return "driving";
	}//driving walking transit
	
	@RequestMapping(path = "/transit", method = RequestMethod.GET)
	public String transit(HttpSession session, Model model) {
		//required = falseでrelayPointsの中身が無くてもエラーが起きないようにしている
		model.addAttribute("start", session.getAttribute("start"));	
		model.addAttribute("goal", session.getAttribute("goal"));	
		
		if (session.getAttribute("relayPoints") != null) {
			
			model.addAttribute("relayPoints", session.getAttribute("relayPoints"));
        }
	
		return "transit";
	}//driving walking transit

	@RequestMapping(path = "/walking", method = RequestMethod.GET)
	public String walking(HttpSession session, Model model) {
		//required = falseでrelayPointsの中身が無くてもエラーが起きないようにしている
		model.addAttribute("start", session.getAttribute("start"));	
		model.addAttribute("goal", session.getAttribute("goal"));	
		
		if (session.getAttribute("relayPoints") != null) {
			
			model.addAttribute("relayPoints", session.getAttribute("relayPoints"));
        }
	
		return "walking";
	}//driving walking transit
	
	@RequestMapping(path = "/bycycling", method = RequestMethod.GET)
	public String bycycling(HttpSession session, Model model) {
		//required = falseでrelayPointsの中身が無くてもエラーが起きないようにしている
		model.addAttribute("start", session.getAttribute("start"));	
		model.addAttribute("goal", session.getAttribute("goal"));	
		
		if (session.getAttribute("relayPoints") != null) {
			
			model.addAttribute("relayPoints", session.getAttribute("relayPoints"));
        }
	
		return "bycycling";
	}
	
	public class SessionClearServlet extends HttpServlet {

	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
	        HttpSession session = request.getSession();
	        // セッションに保存された値をクリアする
	        session.removeAttribute("start");
	        session.removeAttribute("goal");
	        session.removeAttribute("relayPoints");
	        System.out.println("セッションクリア");
	    }
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
