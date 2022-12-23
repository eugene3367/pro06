package com.shop2.myapp.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop2.myapp.dto.UserDTO;
import com.shop2.myapp.service.UserService;
import com.shop2.myapp.util.AES256;

@Controller
@RequestMapping("/user/")
public class UserController {
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	UserService userService;
	
	@Autowired
	HttpSession session;
	
	//회원 가입 - 약관 동의 페이지 로딩
	@GetMapping("agree")
	public String getAgree(Model model) throws Exception {
		return "user/agree";
	}	
	
	//회원 가입 - 회원가입폼 페이지 로딩
	@GetMapping("join.do")
	public String getJoin(Model model) throws Exception {
		return "user/userAdd";
	}
	
	@PostMapping("addUser.do")
	public String addUser(@ModelAttribute("user") UserDTO user, Model model) throws Exception {
		AES256 aes256 = new AES256();
		user.setPw(aes256.encrypt(user.getPw()));
		userService.addUser(user);
		return "/";
	}

}
