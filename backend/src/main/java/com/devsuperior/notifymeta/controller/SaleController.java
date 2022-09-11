package com.devsuperior.notifymeta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.notifymeta.entities.Sale;
import com.devsuperior.notifymeta.services.SaleService;
import com.devsuperior.notifymeta.services.SmsService;

// Para definir que a classe vai ser uma classe controladora

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	private SaleService service;
	
	@Autowired
	private SmsService smsService;
	
	
	@GetMapping
	// Método para disponibilizar as vendas para o front end
	public Page<Sale> findSales(
			@RequestParam (value = "minDate", defaultValue = "")String minDate,
			@RequestParam (value = "maxDate", defaultValue = "")String maxDate,
			Pageable pageable) {
		return service.findSales(minDate, maxDate, pageable);
		
	}
	
	@GetMapping("{id}/notification")
	public void notifySms(@PathVariable Long id) {
		smsService.sendSms(id);
	}
}
