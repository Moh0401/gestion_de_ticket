package com.gestion_de_Tickets.ticket_manager.Controller;

import com.gestion_de_Tickets.ticket_manager.Service.ApprenantService;
import com.gestion_de_Tickets.ticket_manager.Service.BaseDeConnaissanceService;
import com.gestion_de_Tickets.ticket_manager.Service.TicketService;
import com.gestion_de_Tickets.ticket_manager.entity.Apprenant;
import com.gestion_de_Tickets.ticket_manager.entity.BaseDeConnaissance;
import com.gestion_de_Tickets.ticket_manager.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apprenants")
public class ApprenantController {

    @Autowired
    private ApprenantService apprenantService;

    @Autowired
    private TicketService ticketService;

    @Autowired
    private BaseDeConnaissanceService baseDeConnaissanceService;

    @GetMapping
    public List<Apprenant> getAllApprenants() {
        return apprenantService.getAllApprenants();
    }

    @GetMapping("/{id}")
    public Apprenant getApprenantById(@PathVariable Long id) {
        return apprenantService.getApprenantById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteApprenant(@PathVariable Long id) {
        apprenantService.deleteApprenant(id);
    }


    @GetMapping("/Voir base-de-connaissances")
    public List<BaseDeConnaissance> getAllBasesDeConnaissance() {
        return baseDeConnaissanceService.getAllBasesDeConnaissance();
    }

    @GetMapping("/Voir base-de-connaissances/{id}")
    public BaseDeConnaissance getBaseDeConnaissanceById(@PathVariable Long id) {
        return baseDeConnaissanceService.getBaseDeConnaissanceById(id);
    }


    @GetMapping("/Voirticket/{id}")
    public Ticket getTicketById(@PathVariable Long id) {
        return ticketService.getTicketById(id);
    }

    @PostMapping("/ticket")
    public Ticket save(@RequestBody Ticket ticket){
        return ticketService.save(ticket);
    }
}
