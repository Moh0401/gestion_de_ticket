package com.gestion_de_Tickets.ticket_manager.Service;

import com.gestion_de_Tickets.ticket_manager.entity.Utilisateur;
import com.gestion_de_Tickets.ticket_manager.Repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
//import org.springframework.security.crypto.password.PasswordEncoder;
import java.util.List;
import java.util.Optional;

@Service


public class UtilisateurService {
    @Autowired
    private UtilisateurRepository utilisateurRepository;



    public Utilisateur save(Utilisateur utilisateur) {
       // utilisateur.setPassword(passwordEncoder.encode(utilisateur.getPassword()));
        return utilisateurRepository.save(utilisateur);
    }

    public Utilisateur findByUsername(String username) {
        return utilisateurRepository.findByUsername(username);
    }

    public List<Utilisateur> findByRole(String role) {
        return utilisateurRepository.findByRole(role);
    }



    public List<Utilisateur> getAllUtilisateurs() {
        return utilisateurRepository.findAll();}

    public Utilisateur getUtilisateurById(Long id) {
        return utilisateurRepository.findById(id).orElse(null);}

    public void deleteUtilisateur(Long id) {
        utilisateurRepository.deleteById(id);}
}
