package com.guilherme.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.guilherme.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	public Payment getPayment(long workerId, int days) {
		return new Payment("Guilherme", 200.0, days);
	}
}