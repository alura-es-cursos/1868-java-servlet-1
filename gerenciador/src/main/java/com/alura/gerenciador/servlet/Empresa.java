package com.alura.gerenciador.servlet;

import java.util.Date;

public class Empresa {
	
	private Integer id;
	private String nombre;
	private Date fechaAbertura = new Date();
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaAbertura() {
		return fechaAbertura;
	}
	public void setFechaAbertura(Date fechaAbertura) {
		this.fechaAbertura = fechaAbertura;
	}
	
	
	
}
