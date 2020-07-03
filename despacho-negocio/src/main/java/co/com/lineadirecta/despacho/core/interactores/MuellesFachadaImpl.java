package co.com.lineadirecta.despacho.core.interactores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.lineadirecta.despacho.core.external.RepositorioMuelles;
import co.com.lineadirecta.entidades.Muelle;
import co.com.lineadirecta.soporte.dto.AsignarCajaAMuelleDTO;

@Component
public class MuellesFachadaImpl implements AsignarCajaInputPort {

	AsignarCajaAMuelleDTO asignarCajaAMuelleDTO;

	RepositorioMuelles repositorioMuelles;
	
	AsignarCajaOutputPort asignarCajaOutputPort; // Presenter

	@Autowired
	public MuellesFachadaImpl(RepositorioMuelles repositorioMuelles, AsignarCajaOutputPort asignarCajaOutputPort) {
		this.repositorioMuelles = repositorioMuelles;
		this.asignarCajaOutputPort = asignarCajaOutputPort;
	}

	@Override
	public void setInputData(AsignarCajaAMuelleDTO asignarCajaAMuelleDTO) {
		this.asignarCajaAMuelleDTO = asignarCajaAMuelleDTO;
	}

	@Override
	public void ejecutar() {
		// Muelle muelle = new Muelle(this.asignarCajaAMuelleDTO.getIdMuelle());
		// muelle = repositorioMuelles.obtener(muelle);

		// Caja caja = new Caja(this.asignarCajaAMuelleDTO.getIdCaja());

		// muelle.asignarCaja(caja);

		// asignarCajaOutputPort.presentar(muelle);
		
		Muelle muelle =  new Muelle();
		muelle.setNombre(this.asignarCajaAMuelleDTO.getIdMuelle());
		repositorioMuelles.adicionarMuelle(muelle); 
		
		
		

	}

}
