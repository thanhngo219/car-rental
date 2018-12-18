package edu.mum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.domain.User;
import edu.mum.service.UserService;

@Controller
@RequestMapping({"/login"})
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping()
	public String getLoginForm() {
		return "login";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String processLogin(User user, Model model) {
		
		return "redirect:/welcome";
	}
}
