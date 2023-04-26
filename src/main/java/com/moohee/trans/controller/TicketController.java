package com.moohee.trans.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.moohee.trans.dao.TicketDao;
import com.moohee.trans.dto.CardDto;

@Controller
public class TicketController {
	
	private TicketDao dao;
	
	@Autowired	
	public void setDao(TicketDao dao) {
		this.dao = dao;
	}
	
	@RequestMapping(value = "/buy_ticket")
	public String buy_ticket() {
		
		return "buyTicket";
	}

	@RequestMapping(value = "/buyTicketOk")
	public String buy_ticketOk(CardDto cardDto, Model model) {
		
		dao.buyTicket(cardDto);
		
		model.addAttribute("ticketInfo", cardDto);
		
		return "buyTicketOk";
	}

}
