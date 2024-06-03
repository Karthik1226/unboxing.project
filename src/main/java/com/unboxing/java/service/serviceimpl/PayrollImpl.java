package com.unboxing.java.service.serviceimpl;

import com.unboxing.java.entity.Payroll;
import com.unboxing.java.repository.PayrollRepo;
import com.unboxing.java.service.PayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayrollImpl implements PayrollService {
    @Autowired
    private PayrollRepo payrollRepo;

    @Override
    public List<Payroll> getAllPayrolls() {
        return payrollRepo.findAll();
    }

    @Override
    public Payroll createPayroll(Payroll payroll) {
        return payrollRepo.save(payroll);
    }

    @Override
    public void deletePayroll(int id) {
        payrollRepo.deleteById(id);
    }
}
