/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobep.vendingmachine.dao;

import com.jobep.vendingmachine.dto.Item;
import java.math.BigDecimal;

/**
 *
 * @author powel
 */
public interface VMDao {
    public void removeItem(String itemName);
    public void addChange(BigDecimal change);
    
    public String marshall(Item currItem);
    public Item unmarshall(String itemAsString);
    public void writeFile();
    public void readFile();
}
