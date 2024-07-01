package com.gestion_de_Tickets.ticket_manager.entity;

import com.gestion_de_Tickets.ticket_manager.enums.ClassificationTicket;
import com.gestion_de_Tickets.ticket_manager.enums.Priorite;
import com.gestion_de_Tickets.ticket_manager.enums.Status;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;
    private String description;
    @Enumerated(EnumType.ORDINAL)
    private Status statut;
    private Date date = new Date();
    private String email;

    @Enumerated(EnumType.ORDINAL)
    private Priorite priorite;

    @Enumerated(EnumType.ORDINAL)
    private ClassificationTicket classification;

    @ManyToOne
    @JoinColumn(name = "apprenant_id")
    private Apprenant apprenant;

    @ManyToOne
    @JoinColumn(name = "base_de_connaissance_id")
    private BaseDeConnaissance baseDeConnaissance;

    @ManyToOne
    @JoinColumn(name = "formateur_id")
    private Formateur formateur;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;

    // Getters
    public Long getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public Status getStatut() {
        return statut;
    }

    public Priorite getPriorite() {
        return priorite;
    }

    public ClassificationTicket getClassification() {
        return classification;
    }

    public Apprenant getApprenant() {
        return apprenant;
    }

    public BaseDeConnaissance getBaseDeConnaissance() {
        return baseDeConnaissance;
    }

    public Formateur getFormateur() {
        return formateur;
    }
    public Admin getAdmin() {
        return admin;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatut(String statut) {
        this.statut = Status.valueOf(statut);
    }

    public void setPriorite(String priorite) {
        this.priorite = Priorite.valueOf(priorite);
    }

    public void setClassification(String classification) {
        this.classification = ClassificationTicket.valueOf(classification);
    }

    public void setApprenant(Apprenant apprenant) {
        this.apprenant = apprenant;
    }

    public void setBaseDeConnaissance(BaseDeConnaissance baseDeConnaissance) {
        this.baseDeConnaissance = baseDeConnaissance;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }

    public void setAdmin(Admin admin) { this.admin = admin;}
}
