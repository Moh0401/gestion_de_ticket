package com.gestion_de_Tickets.ticket_manager.Service;

import com.gestion_de_Tickets.ticket_manager.Repository.ApprenantRepository;
import com.gestion_de_Tickets.ticket_manager.Repository.BaseDeConnaissanceRepository;
import com.gestion_de_Tickets.ticket_manager.Repository.TicketRepository;
import com.gestion_de_Tickets.ticket_manager.entity.Apprenant;
import com.gestion_de_Tickets.ticket_manager.entity.BaseDeConnaissance;
import com.gestion_de_Tickets.ticket_manager.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApprenantService {

    @Autowired
    private ApprenantRepository apprenantRepository;

    @Autowired
    private BaseDeConnaissanceRepository baseDeConnaissanceRepository;

    @Autowired
    private TicketRepository ticketRepository;

    public Apprenant save(Apprenant apprenant) {
        return apprenantRepository.save(apprenant);
    }

    public List<Apprenant> getAllApprenants() {
        return apprenantRepository.findAll();
    }

    public Apprenant getApprenantById(Long id) {
        return apprenantRepository.findById(id).orElse(null);
    }

    public void deleteApprenant(Long id) {
        apprenantRepository.deleteById(id);
    }

    public List<BaseDeConnaissance> consulterBaseDeConnaissances() {
        return baseDeConnaissanceRepository.findAll();
    }

    public Ticket soumettreTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public List<Ticket> voirTickets(Apprenant apprenant) {
        return ticketRepository.findByApprenant(apprenant);
    }
}