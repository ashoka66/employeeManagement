package com.Ak.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Ak.entity.Employee;


@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
	
	
	
	// future coding 
	/*//	List<Employee> findByEnameContainingOrEjobContainingOrEaddrContaining(String ename, String ejob, String eaddr);
		@Query("SELECT e FROM Employee e " +
			       "WHERE LOWER(e.ename) LIKE LOWER(CONCAT('%', :keyword, '%')) " +
			       "OR LOWER(e.ejob) LIKE LOWER(CONCAT('%', :keyword, '%')) " +
			       "OR LOWER(e.eaddr) LIKE LOWER(CONCAT('%', :keyword, '%'))")
			List<Employee> searchAcrossFields(@Param("keyword") String keyword);
		*/
	

}
