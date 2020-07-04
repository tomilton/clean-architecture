package com.despacho.servicios.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.despacho.core.interactores.AsignarCajaInputPort;
import com.despacho.soporte.dto.AsignarCajaAMuelleDTO;

@RestController
public class MuellesController {

	@Autowired
	private AsignarCajaInputPort asignarCajaInputPort;

	public MuellesController(AsignarCajaInputPort asignarCajaInputPort) {
		this.asignarCajaInputPort = asignarCajaInputPort;
	}

	@GetMapping("/listar")
	public List<AsignarCajaAMuelleDTO> obtenerMuelles() {
		List<AsignarCajaAMuelleDTO> muelles = new ArrayList<>();
		return muelles;
	}

	public void asignarCajaAMuelle(String idCaja, String idMuelle) {

		AsignarCajaAMuelleDTO inpuData = new AsignarCajaAMuelleDTO();
		inpuData.setIdCaja(idCaja);
		inpuData.setIdMuelle(idMuelle);

		this.asignarCajaInputPort.setInputData(inpuData);
		this.asignarCajaInputPort.ejecutar();

	}

}
