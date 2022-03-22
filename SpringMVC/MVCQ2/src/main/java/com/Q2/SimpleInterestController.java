package com.Q2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleInterestController {
	
	@RequestMapping(value="/simpleInterest",method = RequestMethod.GET)
	public ModelAndView simpleIntrest() {
		ModelAndView modelAndView = new ModelAndView("simpleInterest");
		return modelAndView;
	}
	
	@RequestMapping(value="/simpleInterestView",method=RequestMethod.POST)
	public ModelAndView calculateSI(@ModelAttribute("SI")SICalculator SI) {
		ModelAndView modelAndView = new ModelAndView("simpleInterestView");
		double msg = SI.ROICal1();
		modelAndView.addObject("msg",msg);
		return modelAndView;
		
	}

}