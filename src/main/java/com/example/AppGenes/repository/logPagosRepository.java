package com.example.AppGenes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.AppGenes.models.logpagos;

@Repository
public interface logPagosRepository extends JpaRepository<logpagos, Long> {
}