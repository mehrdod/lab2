package eBay;


import javax.transaction.Transactional;

import model.User;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Transactional
public class RegController {
	@RequestMapping(value = "/reg")
	public String run(@ModelAttribute ("signup") User user){
		if (user.getName() != null && user.getpWord() != null && user.getEmail() != null){
			System.out.println(user.getName());
			System.out.println(user.getEmail());
			System.out.println(user.getpWord());
			System.out.println(HibernateUtilities.session.getTransaction().isActive());
			HibernateUtilities.session.beginTransaction();				
			HibernateUtilities.session.save(user);	
			HibernateUtilities.session.getTransaction().commit();
		}
			
		return "reg";
		
	}

}
