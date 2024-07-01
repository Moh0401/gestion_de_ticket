package com.gestion_de_Tickets.ticket_manager.Controller;

import com.gestion_de_Tickets.ticket_manager.Service.*;
import com.gestion_de_Tickets.ticket_manager.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/formateurs")
public class FormateurController {

    @Autowired
    private FormateurService formateurService;

    @Autowired
    private TicketService ticketService;

    @Autowired
    private BaseDeConnaissanceService baseDeConnaissanceService;

    @Autowired
    private ApprenantService apprenantService;

    @Autowired
    private NotificationService notificationService;




    @PostMapping("/CréerApprenant")
    public Apprenant createApprenant(@RequestBody Apprenant apprenant) {
        return apprenantService.save(apprenant);
    }


    @GetMapping("/VoirFormateurs")
    public List<Formateur> getAllFormateurs() {
        return formateurService.getAllFormateurs();
    }

    @GetMapping("/{id}")
    public Formateur getFormateurById(@PathVariable Long id) {
        return formateurService.getFormateurById(id);
    }

    @GetMapping("Voirticket/{id}")
    public Ticket getTicketById(@PathVariable Long id) {
        return ticketService.getTicketById(id);
    }

    @GetMapping("/VoirTickets")
    public List<Ticket> getAllTickets() {
        return ticketService.getAllTickets();
    }

    //@DeleteMapping("/{id}")
    //public void deleteFormateur(@PathVariable Long id) {
     //   formateurService.deleteFormateur(id);
    //}
    @PutMapping("/mettre-a-jour-ticket")
    public Ticket mettreAJourTicket(@RequestBody Ticket ticket) {
        return formateurService.mettreAJourTicket(ticket);
    }


    @PostMapping("/cloturer-ticket/{ticketId}")
    public Ticket cloturerTicket(@PathVariable Long ticketId) {
        return formateurService.cloturerTicket(ticketId);
    }

    @DeleteMapping("Tickets/{id}")
    public void deleteTicket(@PathVariable Long id) {
        ticketService.deleteTicket(id);
    }

    @PostMapping("/base-de-connaissance")
    public BaseDeConnaissance createBaseDeConnaissance(@RequestBody BaseDeConnaissance baseDeConnaissance) {
        return baseDeConnaissanceService.save(baseDeConnaissance);
    }

    @DeleteMapping("/base-de-connaissance/{id}")
    public void deleteBaseDeConnaissance(@PathVariable Long id) {
        baseDeConnaissanceService.deleteBaseDeConnaissance(id);
    }
}

