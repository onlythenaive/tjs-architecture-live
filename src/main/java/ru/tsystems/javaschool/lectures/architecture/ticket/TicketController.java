package ru.tsystems.javaschool.lectures.architecture.ticket;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @RequestMapping(path = "/tickets")
    public Collection<TicketInfo> getAll() {
        return ticketService.getAll();
    }
}
