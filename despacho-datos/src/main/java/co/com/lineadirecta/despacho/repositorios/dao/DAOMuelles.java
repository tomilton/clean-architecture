package co.com.lineadirecta.despacho.repositorios.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.com.lineadirecta.entidades.Muelle;

import java.util.List;

@Repository
public interface DAOMuelles extends JpaRepository<Muelle, Integer> {
	public List<Muelle> findByNombre(String nombre);

	@Query(nativeQuery = true, value = "SELECT * FROM ControlDespachosMuelle WHERE nombreMuelle like '%' + ? + '%' ")
	public List<Muelle> buscarPorNombreParcial(String token);

}
