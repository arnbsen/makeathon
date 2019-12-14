package com.infy.funjourney.api;

import com.infy.funjourney.model.Guest;
import com.infy.funjourney.model.Ticket;
import com.infy.funjourney.service.TicketService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ticket")
public class TicketAPI {

    @Autowired
    private TicketService ticketService;

    @PostMapping("/add")
    public Ticket addTicket(@RequestBody Ticket ticket) {
        return this.ticketService.addTicket(ticket);
    }

    @GetMapping("/get/{no}")
    public Ticket getTicket(@PathVariable(value = "no") String no) {
        return this.ticketService.getTicket(no);
    }

    @PostMapping("/add/guest")
    public Guest addGuest(@RequestBody Guest guest) {
    	return this.ticketService.addGuest(guest);
    }
    


}