package com.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class TestJenkinsController {

	@GetMapping("/testAPI")
	public String getJenkinsTest() {
		return "API Working";
	}
}
