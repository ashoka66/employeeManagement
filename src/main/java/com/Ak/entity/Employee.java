package com.Ak.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class Employee {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer eid;
	
	@Column(length=30)
	@NonNull
	private String ename;
	
	@Column(length=30)
	@NonNull
	private String ejob;
	
	@Column(length=30)
	@NonNull
	private String eaddr;
	
	@Column
	@NonNull
	private Double esal;
	
	

}
