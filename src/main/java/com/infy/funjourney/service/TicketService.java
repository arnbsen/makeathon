package com.infy.funjourney.service;

import com.infy.funjourney.model.Guest;
import com.infy.funjourney.model.Ticket;
import com.infy.funjourney.repository.GuestRepository;
import com.infy.funjourney.repository.TicketRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;
    
    @Autowired
    private GuestRepository guestRepository;

    public Ticket addTicket(Ticket ticket) {
        return this.ticketRepository.save(ticket);
    }

    public Ticket getTicket(String no) {
        return this.ticketRepository.getTicketByNumber(no);
    }

    public Guest addGuest(Guest guest) {
    	return this.guestRepository.save(guest);
    }
}