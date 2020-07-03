package co.com.lineadirecta.despacho.repositorios;

import org.springframework.stereotype.Service;

import co.com.lineadirecta.despacho.core.external.RepositorioMuelles;
import co.com.lineadirecta.despacho.repositorios.dao.DAOMuelles;
import co.com.lineadirecta.entidades.Muelle;

@Service
public class MySqlRepositorioMuelles implements RepositorioMuelles {

	private DAOMuelles daoMuelles;
	
	@Override
	public void adicionarMuelle(Muelle muelle) {
		daoMuelles.save(muelle);
	}

	@Override
	public Muelle obtener(Muelle muelle) {
		return null;
	}

	@Override
	public void reemplazar(Muelle muelle) {
		daoMuelles.save(muelle);
	}

}
