package com.gestion_de_Tickets.ticket_manager.Repository;

import com.gestion_de_Tickets.ticket_manager.entity.Admin;
import com.gestion_de_Tickets.ticket_manager.entity.Formateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
