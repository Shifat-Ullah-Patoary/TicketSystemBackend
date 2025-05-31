package com.example.OnlineTicketSystem.Repository;

import com.example.OnlineTicketSystem.model.BusList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusListRepo extends JpaRepository<BusList, Long> {
    List<BusList> findByFromIgnoreCaseAndToIgnoreCase(String from, String to);


}
