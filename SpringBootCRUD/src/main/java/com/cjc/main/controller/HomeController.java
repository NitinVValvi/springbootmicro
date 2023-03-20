package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.main.model.Student;
import com.cjc.main.service.HomeService;

@Controller
public class HomeController {
	@Autowired
	HomeService hs;
	@RequestMapping("/")
	public String prelogin()
	{
		return "login";
	}
	
	@RequestMapping("/registration")
	public String preregister()
	{
		return "registration";
	}
	
	@RequestMapping("/reg")
	public String registerData(@ModelAttribute Student s)
	{
		
		hs.saveData(s);
		System.out.println("data save successfully");
		return "login";
	}

	@RequestMapping("/login")
	public String logindata(@RequestParam ("username") String un,@RequestParam("password") String ps,Model m)
	{
		System.out.println("username = "+un);
		System.out.println("password = "+ps);
		
		Student s = hs.logincheck(un,ps);
		
		
		if(s!=null)
		{
			Iterable<Student> list = hs.displayAllData();

			m.addAttribute("data", list);
			//hs.displayAllData();
			return "success";
		}
		else
		{
			return "login";
		}
	
		
	}
	
	@RequestMapping("/delete")
	public String deletedata(@RequestParam ("uid") int uid,Model m)
	{
		hs.deleteRecord(uid);
		Iterable<Student> list = hs.displayAllData();
		m.addAttribute("data",list);
		return "success";
	}
	
	@RequestMapping("/edit")
	public String editdata(@RequestParam ("uid") int uid, Model m)
	{
		
		Student s = hs.editPage(uid);
		m.addAttribute("data",s);
		return "edit";
	}
	
	@RequestMapping("/update")
	public String updatedata(@ModelAttribute Student s, Model m)
	{
		hs.saveData(s);
		Iterable<Student> list = hs.displayAllData();
		
		m.addAttribute("data", list);
		return "success";
				
		
	}
}
