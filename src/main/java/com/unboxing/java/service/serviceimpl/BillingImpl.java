package com.unboxing.java.service.serviceimpl;

import com.unboxing.java.entity.Billing;
import com.unboxing.java.repository.BillingRepo;
import com.unboxing.java.service.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillingImpl implements BillingService {
    @Autowired
    private BillingRepo billingRepo;
    @Override
    public List<Billing> getAllBillings() {
        return billingRepo.findAll();
    }

    @Override
    public Billing createBilling(Billing billing) {
        return billingRepo.save(billing);
    }

    @Override
    public void deleteBilling(int id) {
        billingRepo.deleteById(id);
    }
}
