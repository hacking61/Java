package org.ceeci.controlieweb.bean;

/**
 * Bean para el manejo de usuarios
 * 
 * @author Israel Aguilar Hernández
 * @version 1.0
 * @since 15/May/2012
 *
 */
public class UsuarioBean {
	
	private	String	nombreUsuario		;
	private	String	contrasena			;
	private	int		perfilId			;
	private	String	perfilDescripcion	;
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public int getPerfilId() {
		return perfilId;
	}
	public void setPerfilId(int perfilId) {
		this.perfilId = perfilId;
	}
	public String getPerfilDescripcion() {
		return perfilDescripcion;
	}
	public void setPerfilDescripcion(String perfilDescripcion) {
		this.perfilDescripcion = perfilDescripcion;
	}
	
	
	
	

}
