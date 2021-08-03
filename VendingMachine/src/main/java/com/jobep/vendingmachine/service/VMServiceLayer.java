/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobep.vendingmachine.service;

import com.jobep.vendingmachine.dao.VMAuditDao;
import com.jobep.vendingmachine.dao.VMDao;

/**
 *
 * @author powel
 */
public class VMServiceLayer {
    VMDao dao;
    VMAuditDao audit;
    public VMServiceLayer(VMDao dao, VMAuditDao audit){
        this.dao = dao;
        this.audit = audit;
    }
}
