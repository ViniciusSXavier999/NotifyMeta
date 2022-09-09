package com.devsuperior.notifymeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.notifymeta.entities.Sale;
import com.devsuperior.notifymeta.repositories.SaleRepository;

// Registrando um SaleService como um componente do sistema. 
@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	public List<Sale> findSales(){
		return repository.findAll();
	}

}
