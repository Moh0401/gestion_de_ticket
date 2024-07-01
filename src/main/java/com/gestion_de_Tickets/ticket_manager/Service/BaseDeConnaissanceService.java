package com.gestion_de_Tickets.ticket_manager.Service;

import com.gestion_de_Tickets.ticket_manager.Repository.BaseDeConnaissanceRepository;
import com.gestion_de_Tickets.ticket_manager.entity.BaseDeConnaissance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseDeConnaissanceService {
    @Autowired
    private BaseDeConnaissanceRepository baseDeConnaissanceRepository;

    public BaseDeConnaissance save(BaseDeConnaissance baseDeConnaissance) {
        return baseDeConnaissanceRepository.save(baseDeConnaissance);
    }

    public List<BaseDeConnaissance> getAllBasesDeConnaissance() {
        return baseDeConnaissanceRepository.findAll();
    }

    public BaseDeConnaissance getBaseDeConnaissanceById(Long id) {
        return baseDeConnaissanceRepository.findById(id).orElse(null);
    }

    public void deleteBaseDeConnaissance(Long id) {
        baseDeConnaissanceRepository.deleteById(id);
    }
}