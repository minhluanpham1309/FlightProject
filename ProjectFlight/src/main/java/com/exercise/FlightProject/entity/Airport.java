/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercise.FlightProject.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author minhluan
 */
@Entity
@Data
@Table(name = "tblAirport")
public class Airport {
    @Id
    @Column(name="airportId")
    private String airportId;
    
    @Column(name="airportName")
    private String airportName;
    
    @OneToMany(mappedBy = "fromAirport")
    private Set<Flight> flightsFrom;
    
    @OneToMany(mappedBy = "toAirport")
    private Set<Flight> flightsTo;
    
}
