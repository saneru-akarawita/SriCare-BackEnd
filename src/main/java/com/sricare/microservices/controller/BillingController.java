package com.sricare.microservices.controller;

import com.sricare.microservices.dto.BillDTO;
import com.sricare.microservices.service.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/billing")
public class BillingController {

    private final BillingService billingService;

    @Autowired
    public BillingController(BillingService billingService) {
        this.billingService = billingService;
    }

    @GetMapping("/unpaid-bills/{userId}")
    public List<BillDTO> getUnpaidBills(@PathVariable Long userId) {
        return billingService.getUnpaidBills(userId);
    }

    @GetMapping("/bill-details/{billId}")
    public BillDTO getBillDetails(@PathVariable Long billId) {
        return billingService.getBillDetails(billId);
    }

    @PostMapping("/pay-bill/{billId}")
    public void payBill(@PathVariable Long billId) {
        billingService.payBill(billId);
    }
}

