package org.ceeci.controlieweb.bean;

/**
 * Bean para el manejo de perfiles
 * 
 * @author Israel Aguilar Hernandez
 * @version 1.0
 * @since 15/May/2012
 *
 */
public class PerfilBean {
	
	private	int		perfilId	;
	private	String	descripcion	;
	
	public int getPerfilId() {
		return perfilId;
	}
	public void setPerfilId(int perfilId) {
		this.perfilId = perfilId;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
