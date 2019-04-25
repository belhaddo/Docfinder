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
public enum StatusAccount {
    
    Activate("compte actif"),
    Block("compte bloqué");    
    private String name;

    private StatusAccount(String name) {
        this.name = name;
    }
    
    
    
}
