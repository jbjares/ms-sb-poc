package com.example.hrpayroll.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.hrpayroll.entity.Payment;

@Service
public class PaymentService {

	@Value("${hr-worker.host}")
	private String workerHost;
	
	@Autowired
	private RestTemplate restTemplate;
	
	//TODO Replace mock for real implementation eg.: http://localhost:8080/workers/2
	public Payment getPayment(long workerId, int days) {
		
		Map<String,String> uriVariables = new HashMap<String, String>();
		uriVariables.put("id", ""+workerId);
		
		Worker worker = restTemplate.getForObject(workerHost + "/workers/"
				,Worker.class,uriVariables);
		
		return new Payment(worker.getName(),worker.getDailyIncome(),days);
		
	}
	
	
}
