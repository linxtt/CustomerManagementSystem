package com.linxtt.core.dao;

import java.util.List;
import com.linxtt.core.po.BaseDict;

public interface BaseDictDao {
	// �����������ѯ�����ֵ�
    public List<BaseDict> selectBaseDictByTypeCode(String typecode);
}
