package eBay;

import java.util.*;

import model.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping(value = "/main")
	public String run(@ModelAttribute ("enter") User user){
		System.out.println(user.getName());
		if (user.getName() != null && user.getpWord() != null){
			
		}
		
		return "main";
		
	}
}
