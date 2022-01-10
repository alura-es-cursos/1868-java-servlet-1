package com.alura.gerenciador.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class NuevaEmpresaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("nueva empresa registrada");
		
		String nombreEmpresa = request.getParameter("nombre");
		
		Empresa empresa = new Empresa();
		empresa.setNombre(nombreEmpresa);
		
		DB baseDeDatos = new DB();
		baseDeDatos.agregarEmpresa(empresa);
		
		//llamar al jsp
		RequestDispatcher rd = request.getRequestDispatcher("/nuevaEmpresaRegistrada.jsp");
		request.setAttribute("empresa", empresa.getNombre());
		rd.forward(request, response);
	}

}
