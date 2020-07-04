package com.despacho.repositorios;

import org.springframework.stereotype.Service;

import com.despacho.core.external.RepositorioMuelles;
import com.despacho.entidades.Muelle;
import com.despacho.repositorios.dao.DAOMuelles;

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
