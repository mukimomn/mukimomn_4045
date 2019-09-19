package com.expensiveplants;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExpensivePlantsController {

	@RequestMapping("/start")
	public String start() {
		return "start";
	}
	
}
