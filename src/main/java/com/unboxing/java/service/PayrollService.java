package com.unboxing.java.service;

import com.unboxing.java.entity.Payroll;


import java.util.List;

public interface PayrollService {
    List<Payroll> getAllPayrolls();
    Payroll createPayroll(Payroll payroll);
    void deletePayroll(int id);
}
