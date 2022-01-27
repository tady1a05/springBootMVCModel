package com.toby.springMvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String mainPage() {
		return "Main";
	}
	
	@RequestMapping("/processForm")
	public String processForm(HttpServletRequest request,Model model) {
		String name = request.getParameter("Name").toLowerCase();
		System.out.println(name);
		model.addAttribute("Name", name);
		return "summary";
	}
	
	@RequestMapping("/inputForm")
	public String inputForm() {
		return "input";
	}
}
