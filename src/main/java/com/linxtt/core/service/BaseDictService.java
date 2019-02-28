package com.linxtt.core.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.linxtt.core.po.BaseDict;

/**
 * 数据字典Service接口
 */
@Service
public interface BaseDictService {
	//根据类别代码查询数据字典
	public List<BaseDict> findBaseDictByTypeCode(String typecode);	
}
