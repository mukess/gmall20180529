package com.example.service;

import com.example.bean.BaseAttrInfo;
import com.example.bean.BaseCatalog1;
import com.example.bean.BaseCatalog2;
import com.example.bean.BaseCatalog3;

import java.util.List;

public interface ManageService {

    public List<BaseCatalog1> getCatalog1List();

    public List<BaseCatalog2> getCatalog2List(String catalog1Id);

    public List<BaseCatalog3> getCatalog3List(String catalog2Id);

    public List<BaseAttrInfo> getAttrInfoList(String catalog3Id);
}
