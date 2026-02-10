package com.Ak.service;

import java.util.List;

import com.Ak.entity.Employee;

public interface IEmployeeService {
	
	public List<Employee> fetchEmployeelist();
	
	public String registerEmployee(Employee emp);
	
	
	public Employee getEmployeeById(int no);
	public String updateEmployee(Employee emp);
    public String deleteEmployee(int eid);
   
//    public List<Employee> showEmployeeBySearch(String Keyword);
}
 