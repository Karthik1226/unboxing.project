package com.unboxing.java.controller;

import com.unboxing.java.entity.Billing;
import com.unboxing.java.service.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/billing")
public class BillingController {
    @Autowired
    private BillingService billingService;

    @GetMapping
    public List<Billing> getAllBillings() {
        return billingService.getAllBillings();
    }
    @PostMapping
    public Billing createBilling(@RequestBody Billing billing){
        return billingService.createBilling(billing);
    }
    @DeleteMapping
    public void deleteBilling(@PathVariable int id){
        billingService.deleteBilling(id);
    }

}
