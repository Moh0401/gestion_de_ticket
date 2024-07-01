package com.gestion_de_Tickets.ticket_manager.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Apprenant extends Utilisateur {
    @OneToMany(mappedBy = "apprenant", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ticket> tickets;

    public Apprenant(Long id, String username, String email) {
        super(id, username, email);
    }

    public Apprenant() {

    }


    // Méthodes spécifiques à Apprenant

    // Méthode pour soumettre un ticket
    public Ticket soumettreTicket(String titre, String description, BaseDeConnaissance baseDeConnaissance) {
        Ticket ticket = new Ticket();
        ticket.setTitre(titre);
        ticket.setDescription(description);
        ticket.setApprenant(this);
        ticket.setBaseDeConnaissance(baseDeConnaissance);
        return ticket;
    }

    // Méthode pour consulter la base de connaissances
    public List<BaseDeConnaissance> consulterBaseDeConnaissances(List<BaseDeConnaissance> toutesLesBases) {
        return toutesLesBases;
    }

    // Méthode pour voir ses tickets
    public List<Ticket> voirTickets() {
        return tickets;
    }

    // Getters et Setters pour les tickets
    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
}