package com.linxtt.core.service;

import com.linxtt.core.po.Customer;
import com.linxtt.core.utils.Page;

public interface CustomerService {
		// ��ѯ�ͻ��б�
		public Page<Customer> findCustomerList(Integer page, Integer rows, 
	                                        String custName,String custSource,
	                                        String custIndustry,String custLevel);
		//�����ͻ�
		public int createCustomer(Customer customer);
		
		// ͨ��id��ѯ�ͻ�
		public Customer getCustomerById(Integer id);
		// ���¿ͻ�
		public int updateCustomer(Customer customer);
		// ɾ���ͻ�
		public int deleteCustomer(Integer id);
}
