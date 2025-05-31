package com.example.OnlineTicketSystem.Service;


import com.example.OnlineTicketSystem.Repository.BusListRepo;
import com.example.OnlineTicketSystem.model.BusList;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BusListService {


    private final BusListRepo repo;

    public BusList addBus(BusList bus )
    {
        return repo.save(bus);
    }

    public List<BusList> searchBuses(String from, String to) {
        return repo.findByFromIgnoreCaseAndToIgnoreCase(from, to);
    }


    public List<BusList> getBusData()
    {
        return repo.findAll();

    }
}
