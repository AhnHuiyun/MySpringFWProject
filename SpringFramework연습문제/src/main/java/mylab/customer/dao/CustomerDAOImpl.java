package mylab.customer.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mylab.customer.dao.mapper.CustomerMapper;
import mylab.customer.vo.CustomerVO;

@Repository("customerDAO")
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	private CustomerMapper customerMapper;
	
	@Override
	public CustomerVO selectCustomer(int id) {
		CustomerVO customerVO  = customerMapper.selectCustomerById(id);
		return customerVO;
	}

	public List<CustomerVO> selectAllCustomer() {
		List<CustomerVO> customerList = customerMapper.selectAllCustomerList();
		return customerList;
	}
	
	public void insertCustomer(CustomerVO customerVO) {
		customerMapper.insertCustomer(customerVO);
		System.out.println("등록된 Record Email=" + customerVO.getEmail() + " Name=" + customerVO.getName());
	}
}
