/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercise.FlightProject.service;

import com.exercise.FlightProject.entity.Flight;
import com.exercise.FlightProject.repository.FlightRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author minhluan
 */
@Service
public class FlightSevice implements IFlightService{
    @Autowired
    private FlightRepository flightRepo;
    
    @Override
    public List<Flight> findAll(){
        return flightRepo.findAll();
    }

    @Override
    public Flight save(Flight flight) {
        return null; //To change body of generated methods, choose Tools | Templates.
    }
}
