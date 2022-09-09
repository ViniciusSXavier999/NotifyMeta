package com.devsuperior.notifymeta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.notifymeta.entities.Sale;
import com.devsuperior.notifymeta.services.SaleService;

// Para definir que a classe vai ser uma classe controladora

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	private SaleService service;
	
	
	@GetMapping
	// Método para disponibilizar as vendas para o front end
	public List<Sale> findSales() {
		return service.findSales();
		
	}
}
