package com.example.usermanage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DemoConller {

	@GetMapping("demo")
	@ResponseBody
	public String getDemo() {
		List lst;
		ArrayList<Object> list = new ArrayList<>();
		return "hello demo";
	}

}
