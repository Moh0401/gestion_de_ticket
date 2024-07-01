package com.gestion_de_Tickets.ticket_manager.Repository;

import com.gestion_de_Tickets.ticket_manager.entity.Apprenant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApprenantRepository extends JpaRepository<Apprenant, Long> {
}
