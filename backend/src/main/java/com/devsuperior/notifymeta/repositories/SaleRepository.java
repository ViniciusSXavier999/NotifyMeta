package com.devsuperior.notifymeta.repositories;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.notifymeta.entities.Sale;

// Componente do sistema responsavel por acessar o banco de dados, consulta, salvar, deletar etc.

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
	// Comando na linguagem JPQL, semelhante a linguagem sql.
	
	@Query("SELECT obj FROM Sale obj WHERE obj.date BETWEEN :min AND :max ORDER BY obj.amount DESC")
	Page<Sale> findSales(LocalDate min, LocalDate max, Pageable pageable);

}
