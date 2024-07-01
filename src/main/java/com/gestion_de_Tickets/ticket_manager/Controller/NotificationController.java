package com.gestion_de_Tickets.ticket_manager.Controller;

import com.gestion_de_Tickets.ticket_manager.Repository.ApprenantRepository;
import com.gestion_de_Tickets.ticket_manager.Service.NotificationService;
import com.gestion_de_Tickets.ticket_manager.entity.Apprenant;
import com.gestion_de_Tickets.ticket_manager.entity.Notification;
import com.gestion_de_Tickets.ticket_manager.entity.Ticket;
import com.gestion_de_Tickets.ticket_manager.entity.Utilisateur;
import com.gestion_de_Tickets.ticket_manager.Service.UtilisateurService;
import com.gestion_de_Tickets.ticket_manager.Service.TicketService;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    private NotificationService emailService;

    @PostMapping("/sendEmail")
    public String sendEmail(@RequestBody Notification notification) {
        String message = "New Product Launch: Smart Wearable Fitness Tracker";

        try {
            emailService.sendEmail(notification);
            return "Email sent successfully";
        } catch (MessagingException e) {
            return "Error sending email: " + e.getMessage();
        }
    }
}
