package com.linxtt.core.service;

import com.linxtt.core.po.User;

public interface UserService {
	//通过账号和密码查询用户
	User findUser(String usercode,String password);
}
