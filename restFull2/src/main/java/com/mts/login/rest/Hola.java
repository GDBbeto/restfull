package com.mts.login.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.mts.login.rest.DatosPersona;


@Path("/hola")
public class Hola {
	/*
	@GET
	@Path("/datos")
	public DatosPersona getMsg() {		
		DatosPersona datosPersona= new DatosPersona();
		datosPersona.setNombreUsuario("Roberto Antonio");
		datosPersona.setApePaterno("Aguilar");		
		return datosPersona;
	}
	*/

	
	@GET
	@Path("/nombre")
	public String nombre(){
		return "Roberto Antonio";
	}
	@GET
	@Path("/apellido")
	public String apellido(){
		return "Aguilar";
	}
}
