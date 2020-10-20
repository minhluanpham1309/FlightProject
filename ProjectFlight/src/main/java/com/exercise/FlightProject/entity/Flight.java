/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercise.FlightProject.entity;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author minhluan
 */
@Entity
@Data
@Table(name="Flight")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="flightNumber")
    private String flightNumber;
    
    @Column(name="departDate")
    private String departDate;
    
    @Column(name="arrivDate")
    private String arrivDate;
    
    @Column(name="price")
    private String price;
    
    @ManyToOne
    @JoinColumn(name = "departAirportId", nullable = false)
    private Airport fromAirport;
    
    @ManyToOne
    @JoinColumn(name = "arrivAirportId", nullable = false)
    private Airport toAirport;
    
    @OneToMany(mappedBy = "flight")
    private Set<OrderFlight> orderFlights;
}
