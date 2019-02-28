package com.linxtt.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linxtt.core.dao.BaseDictDao;
import com.linxtt.core.po.BaseDict;
import com.linxtt.core.service.BaseDictService;
@Service("baseDictService")
public class BaseDictServiceImpl implements BaseDictService {
	
	@Autowired
	private BaseDictDao baseDictDao;
	
	@Override
	public List<BaseDict> findBaseDictByTypeCode(String typecode) {
		// TODO Auto-generated method stub
		return baseDictDao.selectBaseDictByTypeCode(typecode);
	}

}
