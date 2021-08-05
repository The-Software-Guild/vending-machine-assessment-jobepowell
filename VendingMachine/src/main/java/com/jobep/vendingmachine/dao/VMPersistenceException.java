/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobep.vendingmachine.dao;

/**
 *
 * @author powel
 */
public class VMDaoInsufficientFundsException extends Exception{
    public VMDaoInsufficientFundsException(String message){
        super(message);
    }
    public VMDaoInsufficientFundsException(String message, Throwable cause){
        super(message,cause);
    }
    
}
