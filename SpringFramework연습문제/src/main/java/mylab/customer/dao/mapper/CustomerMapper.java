package mylab.customer.dao.mapper;

import java.util.List;

import mylab.customer.vo.CustomerVO;

public interface CustomerMapper {
	CustomerVO selectCustomerById(int id);
	List<CustomerVO> selectAllCustomerList();
	CustomerVO insertCustomer(CustomerVO customer);
}
