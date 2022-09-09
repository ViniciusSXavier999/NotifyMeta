package com.devsuperior.notifymeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.notifymeta.entities.Sale;

// Componente do sistema responsavel por acessar o banco de dados, consulta, salvar, deletar etc.

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
