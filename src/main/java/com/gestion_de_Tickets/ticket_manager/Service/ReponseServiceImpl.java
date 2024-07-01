package com.gestion_de_Tickets.ticket_manager.Service;

import com.gestion_de_Tickets.ticket_manager.Repository.FormateurRepository;
import com.gestion_de_Tickets.ticket_manager.Repository.ReponseRepository;
import com.gestion_de_Tickets.ticket_manager.Repository.TicketRepository;
import com.gestion_de_Tickets.ticket_manager.entity.Formateur;
import com.gestion_de_Tickets.ticket_manager.entity.Reponse;
import com.gestion_de_Tickets.ticket_manager.entity.Ticket;
import lombok.AllArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ReponseServiceImpl implements ReponseService {

    private ReponseRepository reponseRepository;
    private TicketRepository ticketRepository;
    private FormateurRepository formateurRepository;

    public Formateur getConnectedUser_usename() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username;

        if (principal instanceof UserDetails) {
            username = ((UserDetails)principal).getUsername();
            return formateurRepository.findByUsername(username);
        } else {
            username = principal.toString();
        }
        return formateurRepository.findByUsername(username);
    }

    @Override
    public Reponse Creerreponse(Long id, Reponse reponse) {
        Optional<Ticket> ticket = ticketRepository.findById(id);
        reponse.setTicket(ticket.get());
        reponse.setFormateur(getConnectedUser_usename());
        return reponseRepository.save(reponse);
    }

    @Override
    public Reponse Updatereponse(Long id, Reponse reponse) {
        return reponseRepository.findById(id)
                .map(p->{
                    p.setReponse(reponse.getReponse());
                    return reponseRepository.save(p);
                }).orElseThrow(()->new RuntimeException("Reponse n'existe pas"));
    }

    @Override
    public String Supprimerreponse(Long id) {
        reponseRepository.deleteById(id);
        return "Reponse supprimer avec succes";
    }

    @Override
    public List<Reponse> Afficherreponse() {
        return reponseRepository.findAll();
    }
}