package com.linxtt.core.dao;

import org.apache.ibatis.annotations.Param;

import com.linxtt.core.po.User;

public interface UserDao {
	
	/**
	 * ͨ���˺ź������ѯ�û�
	 */
	public User findUser(@Param("usercode") String usercode,
			                @Param("password") String password);
	
}
