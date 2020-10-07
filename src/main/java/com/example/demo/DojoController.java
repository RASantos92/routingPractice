package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/m/{var}")
	public String dojo(@PathVariable("var") String var) {
		String output = "";
		if (var.equals("burbank-dojo")) {
			output += "Burbank Dojo is located in Southern California";
		} else if (var.equals("san-jose")) {
			output += "SJ dojo is the headquearters";
		} else {
			output += var + " is awsome";
		}
		return output;
	}

}
