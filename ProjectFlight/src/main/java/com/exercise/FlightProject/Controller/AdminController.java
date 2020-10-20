/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercise.FlightProject.Controller;

import com.exercise.FlightProject.service.FlightSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author DEVELOPER
 */
@Controller
public class AdminController {
    
    @Autowired
    private FlightSevice flightService;
    
    @RequestMapping(value = "/admin/listFlight")
    public String ListFlight(Model model){
        model.addAttribute("flights", flightService.findAll());
        return "admin/listFlight";
    }
}
