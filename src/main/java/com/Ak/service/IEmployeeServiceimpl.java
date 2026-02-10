package com.Ak.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ak.entity.Employee;
import com.Ak.repository.IEmployeeRepository;

@Service
public class IEmployeeServiceimpl implements IEmployeeService {
    
	@Autowired
	private IEmployeeRepository emprepo;

	@Override
	public List<Employee> fetchEmployeelist() {
		System.out.println("IEmployeeServiceimpl.fetchEmployeelist()");
		List<Employee> list=emprepo.findAll();
		
		return list;
	}

	@Override
	public String registerEmployee(Employee emp) {
		System.out.println("IEmployeeServiceimpl.registerEmployee()");
		return "Employee is registered with idval::"+emprepo.save(emp).getEid(); 
	}
	
	@Override
	public Employee getEmployeeById(int no) {
		
		Employee emp=emprepo.findById(no).orElseThrow(()->new IllegalArgumentException());
		
		return emp;
	}

	@Override
	public String updateEmployee(Employee emp) {
		
		return "Employee is updated having idval::"+emprepo.save(emp).getEid();
	}

	@Override
	public String deleteEmployee(int eid) {
		
		emprepo.deleteById(eid);
	
		return "The Employee is Removed From list with the idval::"+eid;
	}

	
	
	// future coding 
	/*@Override
	public List<Employee> showEmployeeBySearch(String Keyword) {
		System.out.println("IEmployeeServiceimpl.showEmployeeBySearch()");
		if(Keyword==null || Keyword.isEmpty()) {
			
		    return  emprepo.findAll();	
			
		}
		
	//		return emprepo.findByEnameContainingOrEjobContainingOrEaddrContaining(Keyword, Keyword, Keyword);
		return emprepo.searchAcrossFields(Keyword);
	}
	*/
	
	
	
	
	
}
