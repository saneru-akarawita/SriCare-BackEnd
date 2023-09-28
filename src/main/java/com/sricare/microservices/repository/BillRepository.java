package com.sricare.microservices.repository;

import com.sricare.microservices.model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BillRepository extends JpaRepository<Bill, Long> {
    List<Bill> findByUserIdAndStatus(Long userId, String status);
}

