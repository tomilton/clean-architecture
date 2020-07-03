package co.com.lineadirecta.despacho.repositorios.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import co.com.lineadirecta.entidades.Factura;

@Repository
public interface DAOFacturas extends JpaRepository<Factura, String> {
}
