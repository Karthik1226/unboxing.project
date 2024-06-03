package com.unboxing.java.repository;

import com.unboxing.java.entity.Payroll;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayrollRepo extends JpaRepository<Payroll,Integer> {
}
