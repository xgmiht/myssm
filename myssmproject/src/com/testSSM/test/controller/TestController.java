package com.testSSM.test.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.testSSM.test.model.User;
import com.testSSM.test.service.TestService;

@Controller
@RequestMapping("/test")
public class TestController {

	@Resource
	private TestService testService;
//	
//	public TestService getTestService() {
//		return testService;
//	}
//	public void setTestService(TestService testService) {
//		this.testService = testService;
//	}


	@RequestMapping("INSER")
	public String insertform(HttpServletRequest request, Model model) throws Exception{
		return "insertform";
	}
	@RequestMapping("test")
	public String test(HttpServletRequest request, Model model) throws Exception{
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = testService.queryTest(userId);
		System.out.println(user.getUserName());
		model.addAttribute("user", user);
		return "showUser";
	}
	@RequestMapping("insert")
	public String insert(User user,HttpServletRequest request, Model model) throws Exception{
		//int userId = Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("userName");
		String password=request.getParameter("password");
		System.out.println(name);
		System.out.println(password);
		user.setUserName(name);
		user.setPassword(password);
		 testService.insertUser(user);
		System.out.println(user.getUserName());
		model.addAttribute("user", user);
		return "showUser";
	}
	@RequestMapping("update")
	public String update(User user,HttpServletRequest request, Model model) throws Exception{
		int userId = Integer.parseInt(request.getParameter("id"));
		 testService.updateUser(user);
		System.out.println(user.getUserName());
		model.addAttribute("user", user);
		return "showUser";
	}
	@RequestMapping("delete")
	public String delete(User user,HttpServletRequest request, Model model) throws Exception{
		int userId = Integer.parseInt(request.getParameter("id"));
		 testService.deleteUser(user);
		System.out.println(user.getUserName());
		model.addAttribute("user", user);
		return "showUser";
	}
	@RequestMapping("save")
	public String testrans(User user,HttpServletRequest request, Model model) throws Exception{
		String name=request.getParameter("userName");
		String password=request.getParameter("password");
		System.out.println(name);
		System.out.println(password);
		user.setUserName(name);
		user.setPassword(password);
		 testService.save(user);
		System.out.println(user.getUserName());
		model.addAttribute("user", user);
		return "showUser";
	}
}
