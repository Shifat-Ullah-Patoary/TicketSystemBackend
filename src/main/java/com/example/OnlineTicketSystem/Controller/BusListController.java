package com.example.OnlineTicketSystem.Controller;


import com.example.OnlineTicketSystem.Service.BusListService;
import com.example.OnlineTicketSystem.model.BusList;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins ="http://localhost:4200")
@RequestMapping("/api")
@RestController
@RequiredArgsConstructor
public class BusListController {


    private final BusListService service;

    @PostMapping("/buses")
    public BusList addBus(@RequestBody BusList bus)
    {
          return service.addBus(bus);

    }

    @GetMapping("/buses/search")
    public List<BusList> searchBuses(@RequestParam String from, @RequestParam String to) {
        return service.searchBuses(from, to);
    }


    @GetMapping("/buslists")
    public List<BusList> getAllData()
    {
        return service.getBusData();
    }


}
