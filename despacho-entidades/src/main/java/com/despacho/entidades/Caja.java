package com.despacho.entidades;

import javax.persistence.*;

/**
 * Representa registro de persistencia de un elemento que se va a transportar
 */

@Entity
@Table(name = "Cajas")
public class Caja {

	@Id
	private String id;
	private Integer tipo;
	private String idMarca;

	@ManyToOne(targetEntity = Factura.class)
	private Factura factura;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public String getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(String idMarca) {
		this.idMarca = idMarca;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}
}
