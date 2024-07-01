package com.gestion_de_Tickets.ticket_manager.Service;

import com.gestion_de_Tickets.ticket_manager.Repository.TicketRepository;
import com.gestion_de_Tickets.ticket_manager.entity.Notification;
import com.gestion_de_Tickets.ticket_manager.entity.Ticket;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    @Autowired
    private TicketRepository ticketRepository;
    @Autowired
    private NotificationService notificationService;

    public Ticket save(Ticket ticket) {
        Notification notification = new Notification();
        notification.setText(ticket.getDescription());
        notification.setDest_email(ticket.getEmail());
        notification.setSubject(ticket.getTitre());

        try {
            notificationService.sendEmail(notification);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }

        return ticketRepository.save(ticket);
    }
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    public Ticket getTicketById(Long id) {
        return ticketRepository.findById(id).orElse(null);
    }

    public void deleteTicket(Long id) {
        ticketRepository.deleteById(id);
    }
}
