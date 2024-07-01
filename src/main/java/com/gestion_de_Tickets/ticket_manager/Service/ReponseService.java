package com.gestion_de_Tickets.ticket_manager.Service;

import com.gestion_de_Tickets.ticket_manager.entity.Reponse;

import java.util.List;

public interface ReponseService {

    //La methode pour creer une reponse.
    Reponse Creerreponse(Long id, Reponse reponse);

    //La methode pour mettre à jour une reponse.
    Reponse Updatereponse(Long id, Reponse reponse);

    //La methode pour supprimer une reponse.
    String Supprimerreponse(Long id);

    //La methode pour Afficher une reponse.
    List<Reponse> Afficherreponse();


}