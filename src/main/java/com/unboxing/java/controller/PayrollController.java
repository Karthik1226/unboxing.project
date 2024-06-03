package com.unboxing.java.controller;

import com.unboxing.java.entity.Payroll;
import com.unboxing.java.service.PayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payroll")
public class PayrollController {
    @Autowired
    private PayrollService payrollService;

    @GetMapping
    public List<Payroll> getAllPayrolls() {
        return payrollService.getAllPayrolls();
    }
    @PostMapping
    public Payroll createPayroll(@RequestBody Payroll payroll){
        return payrollService.createPayroll(payroll);
    }
    @DeleteMapping
    public void deletePayroll(@PathVariable int id){
        payrollService.deletePayroll(id);
    }
}
