package org.rakesh.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.PageContext;

import org.rakesh.entity.User;
import org.rakesh.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.bytebuddy.agent.builder.ResettableClassFileTransformer;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private RestController restController;
	
	@RequestMapping("/welcome")
	public String welcome(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_HOME");
		return "welcomepage.jsp";
	}
	
	@RequestMapping("/register")
	public String register(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_REGISTER");
		return "welcomepage.jsp";
	}
	
	@RequestMapping("/save-user")
	public String registerUser(@ModelAttribute User user, BindingResult bindingResult, HttpServletRequest request) {
		restController.saveUser(user);
		request.setAttribute("mode", "MODE_HOME");
		return "welcomepage.jsp";
	}
	
	@RequestMapping("/show-users")
	public String showUsers(HttpServletRequest request) {
		request.setAttribute("users", restController.showUser());
		request.setAttribute("mode", "ALL_USERS");
		return "welcomepage.jsp";
	}
	
	@RequestMapping("/delete-user")
	public String deletUser(@RequestParam int id, HttpServletRequest request) {
		restController.deleteUser(id);
		return showUsers(request);
	}
	
	@RequestMapping("/edit-user")
	public String editUser(@RequestParam int id, HttpServletRequest request) {
		request.setAttribute("user", restController.editUser(id));
		
		request.setAttribute("mode", "MODE_UPDATE");
		return "welcomepage.jsp";
	}
	
	@RequestMapping("/login")
	public String loginUser(HttpServletRequest request) {
		
		request.setAttribute("mode", "MODE_LOGIN");
		return "welcomepage.jsp";
	}
	
	@RequestMapping("/login-user")
	public String loginUser(@ModelAttribute User user, HttpServletRequest request) {
		User ut = userService.findByUserNamePassword(user.getUserName(), user.getPassword());
		if(ut != null) {
			request.setAttribute("ut", ut);
			if(ut.getId() == 10 || ut.getId() == 3)
				return "home-"+ut.getId()+".jsp";
			return "home.jsp";
		}
		
		request.setAttribute("error", "Invalid username or password");
		request.setAttribute("mode", "MODE_LOGIN");
		return "welcomepage.jsp";
	}
		
		
}
