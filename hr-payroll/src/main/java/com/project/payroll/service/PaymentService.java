package com.project.payroll.service;

import com.project.payroll.entities.Payment;

public interface PaymentService {
	
	Payment getPayment(long workerId, int days);

}
