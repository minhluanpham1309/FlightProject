/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercise.FlightProject.service;

import com.exercise.FlightProject.entity.Flight;
import java.util.List;

/**
 *
 * @author minhluan
 */
public interface IFlightService {
    public List<Flight> findAll();
    public Flight save(Flight flight);

}
