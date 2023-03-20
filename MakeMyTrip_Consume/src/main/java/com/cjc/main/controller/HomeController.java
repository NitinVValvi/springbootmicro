package com.cjc.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cjc.main.model.Customer;
import com.cjc.main.service.HomeService;

@RestController
public class HomeController {

	@Autowired
	RestTemplate restT;
	@Autowired
	HomeService hs;
	
	@RequestMapping("/getCustomerdata")
	public List prelogin()
	{
		Customer c = new Customer();
		c.setCid(1);
		c.setName("nitin");
		c.setUsername("nitin");
		c.setPassword("nitin123");
		c.setEmail("n@gmail.com");
		
		List al = new ArrayList();
		al.add(c);
		return al;
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	
	@RequestMapping("/getcustomer/{un}/{ps}")
	public List getData(@PathVariable ("un") String username, @PathVariable ("ps") String password)
	{
		
		System.out.println("username is " +username);
		System.out.println("password is "+password);
		String url ="http://localhost:9290/getcustomerdata";
		
		List li = restT.getForObject(url, List.class);
		
		return li;
		
	}
	
	@RequestMapping(value ="/regcustomerdata", method = RequestMethod.POST)
	public String regdata(@RequestBody Customer c)
	{
		System.out.println(c.getCid());
		System.out.println(c.getName());
		System.out.println(c.getUsername());
		System.out.println(c.getPassword());
		System.out.println(c.getEmail());
		
		hs.saveData(c);
		/*
		 * //System.out.println(s.getName()); String url =
		 * "http://localhost:9797/regcustomerdata";
		 * 
		 * String val = restT.postForObject(url, c, String.class); return val;
		 */
		return null;
	}
	
	@RequestMapping("/getflight/{flightname}")
	public List getFlightInfo(@PathVariable("flightname") String flight_name) {
		if (flight_name.equals("AirIndia"))
		{
			String url = "http://localhost:9291/getairindia";

			List flightlist = restT.getForObject(url, List.class);
			return flightlist;
		} else if (flight_name.equals("Indigo")) 
		{
			String url = "http://localhost:9292/getindigo";

			List flightlist = restT.getForObject(url, List.class);
			return flightlist;
		} else if (flight_name.equals("SpiceJet")) 
		{
			String url = "http://localhost:9293/getspicejet";

			List flightlist = restT.getForObject(url, List.class);
			return flightlist;
		}
		return null;

	}
}
