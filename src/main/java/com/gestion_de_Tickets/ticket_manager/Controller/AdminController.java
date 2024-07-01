package com.gestion_de_Tickets.ticket_manager.Controller;

import com.gestion_de_Tickets.ticket_manager.Service.AdminService;
import com.gestion_de_Tickets.ticket_manager.Service.UtilisateurService;
import com.gestion_de_Tickets.ticket_manager.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @Autowired
    private UtilisateurService utilisateurService;

    @PostMapping("/CréerAdmin")
    public Admin createAdmin(@RequestBody Admin admin) {
        return adminService.ajouterAdmin(admin);
    }

    @PostMapping("/formateurs")
    public Formateur ajouterFormateur(@RequestBody Formateur formateur) {
        return adminService.ajouterFormateur(formateur);
    }

    @DeleteMapping("/formateurs/{id}")
    public void supprimerFormateur(@PathVariable Long id) {
        adminService.supprimerFormateur(id);
    }

    @DeleteMapping("/apprenants/{id}")
    public void supprimerApprenant(@PathVariable Long id) {
        adminService.supprimerApprenant(id);
    }

    @GetMapping("/liste")
    public List<Formateur> getAllFormateurs() {
        return adminService.getAllFormateurs();
    }

    @GetMapping("/liste-apprenants")
    public List<Apprenant> getAllApprenants() {
        return adminService.getAllApprenants();
    }

    //@DeleteMapping("/{id}")
    //public void deleteUtilisateur(@PathVariable Long id) {
       // utilisateurService.deleteUtilisateur(id);
    //}

    @GetMapping("/Utilisateurs/{id}")
    public Utilisateur getUtilisateurById(@PathVariable Long id) {
        return utilisateurService.getUtilisateurById(id);
    }

}


