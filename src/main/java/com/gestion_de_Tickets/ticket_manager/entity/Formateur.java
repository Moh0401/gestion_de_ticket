package com.gestion_de_Tickets.ticket_manager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "formateur")
public class Formateur extends Utilisateur {

    // Methods specific to Formateur
}