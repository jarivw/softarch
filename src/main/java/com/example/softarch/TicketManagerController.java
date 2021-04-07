package com.example.softarch;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketManagerController {


	@RequestMapping("/")
	public String index() {
		return "Jari is goed in WoW";
	}
	
}
