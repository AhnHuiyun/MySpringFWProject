package mylab.customer.service;

import java.util.List;

import mylab.customer.vo.*;

public interface CustomerService {
	public void insertCustomer(CustomerVO customerVO);

	public List<CustomerVO> getAllCustomerList();

	public CustomerVO getCustomerInfo(int id);
}
