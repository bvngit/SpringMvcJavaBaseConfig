package com.bvn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result", i + j);
		
		return mv;
	}
	
	@RequestMapping(value="/add1", method=RequestMethod.POST)
	public String add1(@RequestParam("t1") int i, @RequestParam("t2") int j, ModelMap model) {
		model.put("result1", i + j);
		
		return "display";
	}
}
