package org.ass.springweb.controller;

import org.ass.springweb.dto.LoginDto;
import org.ass.springweb.dto.RegisterDto;
import org.ass.springweb.service.RegisterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
	@Autowired
	private RegisterServiceImpl registerServiceImpl;

	@RequestMapping(value = "/saveUser")
	public ModelAndView saveUser(RegisterDto registerDto) {
		System.out.println(registerDto);
		registerServiceImpl.processSaveUser(registerDto);
		return new ModelAndView("index.jsp");
	}

	public RegisterController() {
		System.out.println(this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/login")
	public ModelAndView login(LoginDto loginDto) {
		boolean autherised = registerServiceImpl.isAutherised(loginDto);
		if (autherised) {
			return new ModelAndView("home.jsp");
//			return new ModelAndView("home.jsp","userName","Spring");
		}
		return new ModelAndView("login.jsp");
	}
}
