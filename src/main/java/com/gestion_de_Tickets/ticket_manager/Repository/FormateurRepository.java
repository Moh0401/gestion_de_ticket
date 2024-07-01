package com.gestion_de_Tickets.ticket_manager.Repository;

import com.gestion_de_Tickets.ticket_manager.entity.Formateur;
import com.gestion_de_Tickets.ticket_manager.enums.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FormateurRepository extends JpaRepository<Formateur, Long> {
    Formateur findByUsername(String username);
    List<Formateur> findByRole(Role role);
}