package com.Ak.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Ak.entity.Employee;
import com.Ak.service.IEmployeeService;

@Controller
public class EmployeeTestController {
	
	@Autowired
	private IEmployeeService empService;
	
	
	@GetMapping("/")
	public String HomePage() {
		System.out.println("EmployeeTestController.HomePage()");
		//return LVN 
		return "welcome";
	}
	
	
	@GetMapping("/showlist")
	public  String showEmployees(Map<String,Object> map) {
		System.out.println("EmployeeTestController.showEmployees()");
		List<Employee> list=empService.fetchEmployeelist();	
		map.put("emplist", list);
		return "show_emp_list";
	}
	
	
	
	@GetMapping("/emp_add")
	public String registerEmployee(@ModelAttribute("emp") Employee emp,Map<String,Object> map) {
		System.out.println("EmployeeTestController.registerEmployee()");
		//return lvn
		return "emp_registration";
		
	}
	
	@PostMapping("/emp_add")
	public String saveEmployee(@ModelAttribute("emp") Employee emp,RedirectAttributes attrs) {
		System.out.println("EmployeeTestController.saveEmployee()");
		String msg=empService.registerEmployee(emp);
		attrs.addFlashAttribute("msg", msg);
		return "redirect:showlist";
	}
	
	/*@GetMapping("/emp_report")
	public String EmployeeReport(Map<String,Object> map) {
		System.out.println("EmployeeTestController.EmployeeReport()");
		List<Employee> list=empService.fetchEmployeelist();
		map.put("list", list);
		//return lvn
		return "emp_submission";
	}
		*/
	@GetMapping("/emp_edit")
	public String showEditEmployeeFormPage(@RequestParam("no")int no,@ModelAttribute("emp") Employee emp) {
			//use service
		Employee emp1=empService.getEmployeeById(no);
		//copy data 
		BeanUtils.copyProperties(emp1, emp);
		//return lvn
	   return "update_emp";	
	}
	
	@PostMapping("/emp_edit")
	public String updateEmployee(RedirectAttributes attrs,@ModelAttribute("emp") Employee emp) {
		//use update method of service 
		String msg=empService.updateEmployee(emp);
		//put this msg in attrs to carry with anther request to the showlist method 
		attrs.addFlashAttribute("resultMsg", msg);
		//redirect the request to showlist to show the result together(showlist,and msg)
		return "redirect:showlist";
		
	
	}
	@GetMapping("/emp_del")
	public String removeEmployee(RedirectAttributes attrs,@RequestParam int no) {
		//use service
		String delmsg=empService.deleteEmployee(no);
		//add the redirect attribute
		attrs.addFlashAttribute("delmsg", delmsg);	
		return "redirect:showlist";
	}
	
	
	// balance code is there  to add it is not working  right now 
	
	/*@GetMapping("/emp_search")
	public String searchEmployee(@RequestParam("Keyword") String Keyword, Model model) {
		System.out.println("Keyword received: " + Keyword);
		List<Employee> list=empService.showEmployeeBySearch(Keyword);
		
		// for html page
		model.addAttribute("searchlist", list);
	    model.addAttribute("Keyword", Keyword);
		
		return "search_emp";
	}*/
	
	
	

	

}
