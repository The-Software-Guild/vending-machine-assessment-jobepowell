/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobep.vendingmachine.controller;

import com.jobep.vendingmachine.service.VMServiceLayer;
import com.jobep.vendingmachine.ui.VMView;

/**
 *
 * @author powel
 */
public class VMController {
    private VMServiceLayer service;
    private VMView view;
    
    public VMController(VMServiceLayer service, VMView view){
        this.service = service;
        this.view = view;
    }
    
    public void run(){
        
    }
    
    public void getMenuSelection(){
        
    }
}
