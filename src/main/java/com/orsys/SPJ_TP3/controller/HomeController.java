package com.orsys.SPJ_TP3.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.orsys.SPJ_TP3.model.Calcule;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	
	
	
	@RequestMapping(value="/calcule" , method=RequestMethod.POST)
	public String display(HttpServletRequest req,Model m)
	{
	//read the provided form data
		String s=req.getParameter("salaire");
		int sc=Integer.parseInt(s);
		Calcule cl=new Calcule(sc);
		String message=cl.bilan();
		m.addAttribute("salaire", s);
		m.addAttribute("bilan",message);
		return "resultat";
	
	}
}



