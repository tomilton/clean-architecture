package com.despacho.repositorios.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.despacho.entidades.Factura;

@Repository
public interface DAOFacturas extends JpaRepository<Factura, String> {
}
