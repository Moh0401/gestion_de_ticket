package com.gestion_de_Tickets.ticket_manager.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Admin extends Utilisateur {
    public Admin(Long id, String username, String email) {
        super(id, username, email);
    }

    public Admin() {

    }

    // Methods specific to Admin
}