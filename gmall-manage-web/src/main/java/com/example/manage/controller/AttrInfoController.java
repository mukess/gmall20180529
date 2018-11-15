package com.example.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.example.bean.BaseAttrInfo;
import com.example.service.ManageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AttrInfoController {

	@Reference
	ManageService manageService;

	@GetMapping("attrListPage")
	public String attrListPage() {

		return "attrListPage";
	}

	@GetMapping("attrList")
    @ResponseBody
	public String getAttrList(String catalog3Id) {
        List<BaseAttrInfo> attrInfoList = manageService.getAttrInfoList(catalog3Id);
        String baseInfoAttrList = JSON.toJSONString(attrInfoList);
        return baseInfoAttrList;
	}
}
