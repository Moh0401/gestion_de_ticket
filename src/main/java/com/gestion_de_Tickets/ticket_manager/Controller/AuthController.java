package com.gestion_de_Tickets.ticket_manager.Controller;

import com.gestion_de_Tickets.ticket_manager.Service.AdminService;
import com.gestion_de_Tickets.ticket_manager.Service.ApprenantService;
import com.gestion_de_Tickets.ticket_manager.Service.UtilisateurService;
import com.gestion_de_Tickets.ticket_manager.entity.Admin;
import com.gestion_de_Tickets.ticket_manager.entity.Apprenant;
import com.gestion_de_Tickets.ticket_manager.entity.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.gestion_de_Tickets.ticket_manager.enums.Role.apprenant;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UtilisateurService utilisateurService;

    @Autowired
    private ApprenantService apprenantService;

    @Autowired
    private AdminService adminService;

    // Enregistrement d'un nouvel utilisateur
    @PostMapping("/enregister")
    public Utilisateur register(@RequestBody Utilisateur utilisateur) {
        return utilisateurService.save(utilisateur);
    }

    // Enregistrement d'un nouvel apprenant
    @PostMapping("/enregister/apprenant")
    public Apprenant register(@RequestBody Apprenant apprenant) {
        return apprenantService.save(apprenant);
    }
    // Enregistrement d'un nouvel admin
    @PostMapping("/enregister/admin")
    public Admin register(@RequestBody Admin admin) {
        return adminService.ajouterAdmin(admin);
    }
    // Page de connexion
    @GetMapping("/login")
    public String login() {
        return "Veuillez fournir vos identifiants pour vous connecter.";
    }
}
