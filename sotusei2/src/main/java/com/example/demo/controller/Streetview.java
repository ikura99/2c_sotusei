package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class Streetview {

	@RequestMapping(path = "/streetview", method = RequestMethod.GET)
	public String streetview() {
		return "streetview";
	}
	@RequestMapping(path = "/streetview", method = RequestMethod.POST)
	public String streetview2() {
		return "streetview";

	}
}
