package co.com.lineadirecta.despacho.repositorios.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import co.com.lineadirecta.entidades.Caja;

@Repository
public interface DAOCajas extends JpaRepository<Caja, String> {

}
