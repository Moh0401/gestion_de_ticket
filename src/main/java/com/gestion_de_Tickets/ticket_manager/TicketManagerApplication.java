package com.gestion_de_Tickets.ticket_manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication //(exclude = {SecurityAutoConfiguration.class})
public class TicketManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketManagerApplication.class, args);
	}

}
