package com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class DB {
	
	private static List<Empresa> listaEmpresas = new ArrayList<>();
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNombre("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setNombre("Caelum");
		
		listaEmpresas.add(empresa);
		listaEmpresas.add(empresa2);
		
	}

	public void agregarEmpresa(Empresa empresa) {
		DB.listaEmpresas.add(empresa);
	}
	
	public List<Empresa> getEmpresas(){
		return DB.listaEmpresas;
	}

}
