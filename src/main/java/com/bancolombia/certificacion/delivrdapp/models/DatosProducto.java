package com.bancolombia.certificacion.delivrdapp.models;

import java.util.List;
import java.util.Map;

public class DatosProducto {
	private String nombre, descripcion,sku,precio;
	
	public DatosProducto(List<Map<String, String>>datosProducto) {
		this.nombre=datosProducto.get(0).get("nombre");
		this.descripcion=datosProducto.get(0).get("descripcion");
		this.sku=datosProducto.get(0).get("sku");
		this.precio=datosProducto.get(0).get("precio");
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getSku() {
		return sku;
	}

	public String getPrecio() {
		return precio;
	}

}
