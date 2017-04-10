package org.ceeci.controlieweb.dto;

/**
 * DTO para el uso de la tabla ctrl_tc_usuarios
 * 
 * @author Israel Aguilar Hernández
 * @version 1.0
 * @since 15/May/2012
 *
 */
public class CtrlTcUsuariosDTO {
	
	private	String	ctrlChrUsuario	;
	private	String	ctrlChrPasswd	;
	private	Integer	ctrlIntPerfilId	;
	
	public String getCtrlChrUsuario() {
		return ctrlChrUsuario;
	}
	public void setCtrlChrUsuario(String ctrlChrUsuario) {
		this.ctrlChrUsuario = ctrlChrUsuario;
	}
	public String getCtrlChrPasswd() {
		return ctrlChrPasswd;
	}
	public void setCtrlChrPasswd(String ctrlChrPasswd) {
		this.ctrlChrPasswd = ctrlChrPasswd;
	}
	public Integer getCtrlIntPerfilId() {
		return ctrlIntPerfilId;
	}
	public void setCtrlIntPerfilId(Integer ctrlIntPerfilId) {
		this.ctrlIntPerfilId = ctrlIntPerfilId;
	}
	
	

}
