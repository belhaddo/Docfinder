/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.docfinder.entity;

/**
 *
 * @author BADELH
 */
public enum StatusReservation {
    
    Wait("demande initié"),
    Accept("demande accepté"),
    Refuse("demande refusé");
    
    private String name;

    
    private StatusReservation(String name) {
        this.name = name;
    }
    }
