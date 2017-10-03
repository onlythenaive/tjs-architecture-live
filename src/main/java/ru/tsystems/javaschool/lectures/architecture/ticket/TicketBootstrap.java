package ru.tsystems.javaschool.lectures.architecture.ticket;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TicketBootstrap {

    @Autowired
    private TicketRepository ticketRepository;

    @PostConstruct
    public void init() {
        Ticket ticket1 = new Ticket();
        ticket1.setClient("client 1");
        ticket1.setVenue("venue 42");
        ticketRepository.save(ticket1);
        Ticket ticket2 = new Ticket();
        ticket2.setClient("client 2");
        ticket2.setVenue("venue 42");
        ticketRepository.save(ticket2);
    }
}
