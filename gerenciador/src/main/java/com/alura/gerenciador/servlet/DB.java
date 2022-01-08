package com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class DB {
	
	private static List<Empresa> listaEmpresas = new ArrayList<>();

	public void agregarEmpresa(Empresa empresa) {
		DB.listaEmpresas.add(empresa);
	}
	
	public List<Empresa> getEmpresas(){
		return DB.listaEmpresas;
	}

}
