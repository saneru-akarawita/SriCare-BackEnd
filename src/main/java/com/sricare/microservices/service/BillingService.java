package com.sricare.microservices.service;

import com.sricare.microservices.dto.BillDTO;

import java.util.List;

public interface BillingService {
    List<BillDTO> getUnpaidBills(Long userId);
    BillDTO getBillDetails(Long billId);
    void payBill(Long billId);
}
