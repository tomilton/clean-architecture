package com.despacho.repositorios.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.despacho.entidades.Caja;

@Repository
public interface DAOCajas extends JpaRepository<Caja, String> {

}
