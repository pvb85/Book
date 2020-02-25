package com.hcl.synchrony.onlinebookshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.synchrony.onlinebookshopping.entity.User;
import com.hcl.synchrony.onlinebookshopping.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public ModelAndView getMenu() {
		return new ModelAndView("Home");
	}

	@RequestMapping("/loginPage")
	public ModelAndView loginPage(@ModelAttribute("user") User user) {
		return new ModelAndView("loginUser");

	}

	@PostMapping("/login")
	public ModelAndView userLogin(@ModelAttribute("user") User user) {
		String returnPage = "";
		try {
			System.out.println(user.getUserName());
			String userName = user.getUserName();
			String password = user.getUserPasword();

			User user1 = userService.login(userName, password);
			if (user1.getRole().equalsIgnoreCase("A")) {
				returnPage = "loginUser";
			}

		} catch (Exception e) {

		}

		return new ModelAndView(returnPage);

	}

	@RequestMapping(value = "/registerPage", method = RequestMethod.GET)
	public ModelAndView regi(@ModelAttribute("user") User user) {
		return new ModelAndView("userRegistration");

	}

	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("User") User User) {
		String result = null;
		ModelAndView m = null;
		try {

			result = userService.registerUser(User);
			m = new ModelAndView("loginUser", "result", result);
			return m;

		} catch (Exception e) {

			System.out.println(e);
			return m;

		}
	}

}
