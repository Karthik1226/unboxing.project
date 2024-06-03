package com.unboxing.java.repository;

import com.unboxing.java.entity.Billing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingRepo extends JpaRepository<Billing,Integer> {
}
