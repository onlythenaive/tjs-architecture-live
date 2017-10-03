package ru.tsystems.javaschool.lectures.architecture.ticket;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public Collection<TicketInfo> getAll() {
        return ticketRepository
                .findAll()
                .stream()
                .map(this::ticketInfo)
                .collect(Collectors.toList());
    }

    private TicketInfo ticketInfo(Ticket ticket) {
        TicketInfo result = new TicketInfo();
        result.setClient(ticket.getClient());
        result.setId(ticket.getId().toString());
        result.setVenue(ticket.getVenue());
        return result;
    }
}
