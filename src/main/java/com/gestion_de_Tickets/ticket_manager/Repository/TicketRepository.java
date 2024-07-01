package com.gestion_de_Tickets.ticket_manager.Repository;

import com.gestion_de_Tickets.ticket_manager.entity.Apprenant;
import com.gestion_de_Tickets.ticket_manager.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    List<Ticket> findByApprenant(Apprenant apprenant);
}
