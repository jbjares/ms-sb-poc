package com.example.hrpayroll.service;

import org.springframework.stereotype.Service;

import com.example.hrpayroll.entity.Payment;

@Service
public class PaymentService {

	
	//TODO Replace mock for real implementation
	public Payment getPayment(long workerId, int days) {
		
		return new Payment("Joao",200.0,days);
		
	}
	
	
}
