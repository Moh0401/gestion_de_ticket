package com.gestion_de_Tickets.ticket_manager.Repository;

import com.gestion_de_Tickets.ticket_manager.entity.Apprenant;
import com.gestion_de_Tickets.ticket_manager.entity.Reponse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReponseRepository extends JpaRepository<Reponse, Long> {
}
