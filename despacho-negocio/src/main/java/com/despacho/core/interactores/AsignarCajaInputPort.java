package com.despacho.core.interactores;

import com.despacho.soporte.dto.AsignarCajaAMuelleDTO;

public interface AsignarCajaInputPort {

	// Request Model

	public void setInputData(AsignarCajaAMuelleDTO asignarCajaAMuelleDTO);

	public void ejecutar();

}
