/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobep.vendingmachine.dto;

import java.math.BigDecimal;

/**
 *
 * @author powel
 */
public class Item {
    
    String name;
    BigDecimal cost;
    int numItems;
    
    public Item(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public int getNumItems() {
        return numItems;
    }

    public void setNumItems(int numItems) {
        this.numItems = numItems;
    }

    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", cost=" + cost + ", numItems=" + numItems + '}';
    }
    
}
