package com.linxtt.core.service;

import com.linxtt.core.po.User;

public interface UserService {
	//ͨ���˺ź������ѯ�û�
	User findUser(String usercode,String password);
}
