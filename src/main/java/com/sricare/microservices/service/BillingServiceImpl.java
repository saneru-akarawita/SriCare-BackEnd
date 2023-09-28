package com.sricare.microservices.service;

import com.sricare.microservices.dto.BillDTO;
import com.sricare.microservices.model.Bill;
import com.sricare.microservices.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BillingServiceImpl implements BillingService {

    private final BillRepository billRepository;

    @Autowired
    public BillingServiceImpl(BillRepository billRepository) {
        this.billRepository = billRepository;
    }

    @Override
    public List<BillDTO> getUnpaidBills(Long userId) {
        List<Bill> unpaidBills = billRepository.findByUserIdAndStatus(userId, "not-paid");
        return unpaidBills.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public BillDTO getBillDetails(Long billId) {
        Bill bill = billRepository.findById(billId).orElse(null);
        return (bill != null) ? convertToDTO(bill) : null;
    }

    @Override
    public void payBill(Long billId) {
        Bill bill = billRepository.findById(billId).orElse(null);
        if (bill != null) {
            bill.setStatus("paid");
            billRepository.save(bill);
        }
    }

    private BillDTO convertToDTO(Bill bill) {
        BillDTO dto = new BillDTO();
        dto.setId(bill.getId());
        dto.setAmount(bill.getAmount());
        dto.setStatus(bill.getStatus());
        return dto;
    }
}
