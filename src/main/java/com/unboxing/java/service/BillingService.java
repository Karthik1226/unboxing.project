package com.unboxing.java.service;

import com.unboxing.java.entity.Billing;

import java.util.List;

public interface BillingService {
    List<Billing> getAllBillings();
    Billing createBilling(Billing billing);
    void deleteBilling(int id);
}
