package com.linxtt.core.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.linxtt.core.po.BaseDict;

/**
 * �����ֵ�Service�ӿ�
 */
@Service
public interface BaseDictService {
	//�����������ѯ�����ֵ�
	public List<BaseDict> findBaseDictByTypeCode(String typecode);	
}
