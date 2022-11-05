package com.example;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class EmployeeDAO {

	
	private HibernateTemplate temp;

	public void setTemp(HibernateTemplate temp) {
		this.temp = temp;
	}
	
	//insert
	public int insert(Employee e) {
		return (Integer) temp.save(e);
	}
	
	//update 
	public void update(Employee e) {
		 temp.update(e);
	}
	
	//and delete
	
	public void delete(Employee e) {
		  temp.delete(e);
	}
	
	//retrieve
	public List<Employee> getallemployees(){
		String sql="from Employee";
		return (List<Employee>) temp.find(sql);
	}
	
}

