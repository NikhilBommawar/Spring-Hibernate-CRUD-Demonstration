package com.example;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
	private int row;

	@RequestMapping("/insert")
	public ModelAndView insert(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		Employee e=ac.getBean(Employee.class);
		EmployeeDAO dao=ac.getBean(EmployeeDAO.class);
		e.setEname(request.getParameter("ename"));
		e.setEmail(request.getParameter("email"));
		int row=dao.insert(e);
		if(row>0) {
			mv.setViewName("success.jsp");
		}
		else {
			mv.setViewName("failure.jsp");
		}
		return mv;
	}
	
	@ResponseBody
	@RequestMapping("/update")
	public String update(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		Employee e=ac.getBean(Employee.class);
		EmployeeDAO dao=ac.getBean(EmployeeDAO.class);
		e.setEid(Integer.parseInt(request.getParameter("eid")));
	    e.setEmail(request.getParameter("email"));
	    e.setEname(request.getParameter("ename"));
	   // int row =
	    		dao.update(e);
	    		return "Update Successful";
	  //  if(row>0) {
	   // 	mv.setViewName("success.jsp");
	 //   }
	  //  else {
	   // 	mv.setViewName("failure.jsp");
	   // }
	}
	
	//	mv.setViewName("success.jsp");

	@ResponseBody
	@RequestMapping("/Delete")
	public String delete(HttpServletRequest request,HttpServletResponse response) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		Employee e=ac.getBean(Employee.class);
		EmployeeDAO dao=ac.getBean(EmployeeDAO.class);
	    e.setEid(Integer.parseInt(request.getParameter("eid")));
	    dao.delete(e);
		return "Delete Successful";

	}
	
	
	
	
	@RequestMapping("/getall")
	public ModelAndView getall(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		Employee e=ac.getBean(Employee.class);
		EmployeeDAO dao=ac.getBean(EmployeeDAO.class);
		List<Employee> list=dao.getallemployees();
		System.out.println(list);
		mv.setViewName("display.jsp");
		mv.addObject("list", list);
		return mv;
	}
	
	
	

}

