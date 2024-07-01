package com.gestion_de_Tickets.ticket_manager.Service;

import com.gestion_de_Tickets.ticket_manager.Repository.AdminRepository;
import com.gestion_de_Tickets.ticket_manager.Repository.ApprenantRepository;
import com.gestion_de_Tickets.ticket_manager.Repository.FormateurRepository;
import com.gestion_de_Tickets.ticket_manager.Repository.TicketRepository;
import com.gestion_de_Tickets.ticket_manager.entity.Admin;
import com.gestion_de_Tickets.ticket_manager.entity.Apprenant;
import com.gestion_de_Tickets.ticket_manager.entity.Formateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private ApprenantRepository apprenantRepository;

    @Autowired
    private FormateurRepository formateurRepository;

    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private AdminRepository adminRepository;

    // Ajouter un Admin
    public Admin ajouterAdmin(Admin admin) {
        return adminRepository.save(admin);
    }


    // Ajouter un formateur
    public Formateur ajouterFormateur(Formateur formateur) {

        return formateurRepository.save(formateur);
    }

    // Supprimer un formateur
    public void supprimerFormateur(Long id) {
        formateurRepository.deleteById(id);
    }

    // Supprimer un apprenant
    public void supprimerApprenant(Long id) {
        apprenantRepository.deleteById(id);
    }

    // Récupérer tous les formateurs
    public List<Formateur> getAllFormateurs() {
        return formateurRepository.findAll();
    }

    // Récupérer tous les apprenants
    public List<Apprenant> getAllApprenants() {
        return apprenantRepository.findAll();
    }



}

