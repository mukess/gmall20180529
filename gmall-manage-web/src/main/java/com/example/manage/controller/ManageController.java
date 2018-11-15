package com.example.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.example.bean.BaseCatalog1;
import com.example.bean.BaseCatalog2;
import com.example.bean.BaseCatalog3;
import com.example.service.ManageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ManageController {

	@Reference
	ManageService manageService;

	@GetMapping("index")
	public String index() {
		return "index";
	}

	@GetMapping("catalog1List")
	@ResponseBody
	public String catalog1List() {
		List<BaseCatalog1> list = manageService.getCatalog1List();
		String catalog1List = JSON.toJSONString(list);
		return catalog1List;
	}

	@GetMapping("catalog2List")
	@ResponseBody
	public String catalog2List(String catalog1Id) {
		List<BaseCatalog2> list = manageService.getCatalog2List(catalog1Id);
		String catalog2List = JSON.toJSONString(list);
		return catalog2List;
	}

	@GetMapping("catalog3List")
	@ResponseBody
	public String catalog3List(String catalog2Id) {
		List<BaseCatalog3> list = manageService.getCatalog3List(catalog2Id);
		String catalog3List = JSON.toJSONString(list);
		return catalog3List;
	}

}
