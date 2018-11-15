package com.example.manage.servic.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.example.bean.BaseAttrInfo;
import com.example.bean.BaseCatalog1;
import com.example.bean.BaseCatalog2;
import com.example.bean.BaseCatalog3;
import com.example.manage.mapper.*;
import com.example.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ManageServiceImpl implements ManageService {

	@Autowired
	BaseCatalog1Mapper	baseCatalog1Mapper;
	@Autowired
	BaseCatalog2Mapper	baseCatalog2Mapper;
	@Autowired
	BaseCatalog3Mapper	baseCatalog3Mapper;
	@Autowired
	BaseAttrInfoMapper	baseAttrInfoMapper;
	@Autowired
	BaseAttrValueMapper	baseAttrValueMapper;

	public List<BaseCatalog1> getCatalog1List() {
		List<BaseCatalog1> baseCatalog1s = baseCatalog1Mapper.selectAll();
		return baseCatalog1s;
	}

	public List<BaseCatalog2> getCatalog2List(String catalog1Id) {
		BaseCatalog2 baseCatalog2 = new BaseCatalog2();
		baseCatalog2.setCatalog1Id(catalog1Id);
		List<BaseCatalog2> baseCatalog2s = baseCatalog2Mapper.select(baseCatalog2);
		return baseCatalog2s;
	}

	public List<BaseCatalog3> getCatalog3List(String catalog2Id) {
		BaseCatalog3 baseCatalog3 = new BaseCatalog3();
		baseCatalog3.setCatalog2Id(catalog2Id);
		List<BaseCatalog3> baseCatalog3s = baseCatalog3Mapper.select(baseCatalog3);
		return baseCatalog3s;
	}

	public List<BaseAttrInfo> getAttrInfoList(String catalog3Id) {
		BaseAttrInfo baseAttrInfo = new BaseAttrInfo();
		baseAttrInfo.setCatalog3Id(catalog3Id);
		List<BaseAttrInfo> baseAttrInfoList = baseAttrInfoMapper.select(baseAttrInfo);
		return baseAttrInfoList;
	}
}
