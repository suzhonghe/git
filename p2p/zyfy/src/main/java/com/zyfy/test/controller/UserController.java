package com.zyfy.test.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zyfy.test.entity.UserEntity;
import com.zyfy.test.service.UserService;

@Controller
@RequestMapping("/UserController")
public class UserController {

	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/{id}/showUser")
	public String showUser(@PathVariable String id, ModelMap modelMap, HttpServletRequest request){
		
		UserEntity u = userService.getUserEntityById(id);
		
		if(u == null)
		{
			u = new UserEntity();
			u.setEmail("");
			u.setUserId("");
		}
		modelMap.put("user", u);
		return "showUser";
	}
	
	@RequestMapping("showUser")
	public String showUserEntity(String id, ModelMap modelMap, HttpServletRequest request){
		
UserEntity u = userService.getUserEntityById(id);
		
		if(u == null)
		{
			u = new UserEntity();
			u.setEmail("");
			u.setUserId("");
		}
		modelMap.put("user", u);
		return "showUser";
	}
	
	@RequestMapping("/showUserExample")
	public String showUsers(Model model){
		return "redirect:/1/showUser.do";
	}
	
    @RequestMapping("/userList")
    public String list(ModelMap model) {
        model.put("users", userService.getUserEntities());
        return "list";
    }
    
    @RequestMapping("/user/{id}")
    public String detail(@PathVariable String id, ModelMap model) {
        model.put("user", userService.getUserEntityById(id));
        return "detail";
    }
}

