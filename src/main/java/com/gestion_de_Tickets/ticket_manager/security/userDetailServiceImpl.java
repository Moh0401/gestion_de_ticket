package com.gestion_de_Tickets.ticket_manager.security;


import com.gestion_de_Tickets.ticket_manager.Repository.UtilisateurRepository;
import com.gestion_de_Tickets.ticket_manager.entity.Utilisateur;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class userDetailServiceImpl implements UserDetailsService {

    private UtilisateurRepository utilisateurRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        System.out.println("Hello");
        Utilisateur u = utilisateurRepository.findByUsername(username);
        System.out.println("Hello1");
        System.out.println(u.getUsername());
        System.out.println(u.getPassword());
        System.out.println(u.getRole());

        return User.
                withUsername(u.getUsername()).
                password(u.getPassword()).
                roles(String.valueOf(u.getRole())).
                build();
    }
}
