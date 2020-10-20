/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercise.FlightProject.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author minhluan
 */
@Entity
@Data
@Table(name = "orderFlight")
public class OrderFlight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "timeOrder")
    private Timestamp timeOrder;
    
    @Column(name = "adultNumber")
    private int adultNumber;
    
    @Column(name = "seniorNumber")
    private int seniorNumber;
    
    @Column(name = "childNumber")
    private int childNumber;
    
    @Column(name = "totalPrice")
    private Float totalPrice;
    
    @Column(name = "typeOrder")
    private String typeOrder;
    
    @ManyToOne
    @JoinColumn(name = "flightId", nullable = false)
    private Flight flight;
}
