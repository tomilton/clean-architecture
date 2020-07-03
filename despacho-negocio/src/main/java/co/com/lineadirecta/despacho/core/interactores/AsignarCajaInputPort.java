package co.com.lineadirecta.despacho.core.interactores;

import co.com.lineadirecta.soporte.dto.AsignarCajaAMuelleDTO;

public interface AsignarCajaInputPort {

	// Request Model

	public void setInputData(AsignarCajaAMuelleDTO asignarCajaAMuelleDTO);

	public void ejecutar();

}
