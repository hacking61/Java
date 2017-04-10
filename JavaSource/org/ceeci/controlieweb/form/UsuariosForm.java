package org.ceeci.controlieweb.form;

import java.util.List;

import org.apache.struts.action.ActionForm;
import org.ceeci.controlieweb.bean.PerfilBean;
import org.ceeci.controlieweb.bean.UsuarioBean;
import org.ceeci.controlieweb.util.Constantes;

public class UsuariosForm extends ActionForm {
	
	private	String				usuario		;
	private	String				password	;
	private	int					perfilId	;
	private	List<PerfilBean> 	lstPerfiles	;
	private	List<UsuarioBean>	lstUsuarios	;
	
	
	public	void	resetCaptura() {
		setUsuario	( Constantes.CADENA_VACIA 	) ;
		setPassword	( Constantes.CADENA_VACIA 	) ;
		setPerfilId	( Constantes.CERO 			) ;		
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPerfilId() {
		return perfilId;
	}
	public void setPerfilId(int perfilId) {
		this.perfilId = perfilId;
	}
	public List<PerfilBean> getLstPerfiles() {
		return lstPerfiles;
	}
	public void setLstPerfiles(List<PerfilBean> lstPerfiles) {
		this.lstPerfiles = lstPerfiles;
	}
	public List<UsuarioBean> getLstUsuarios() {
		return lstUsuarios;
	}
	public void setLstUsuarios(List<UsuarioBean> lstUsuarios) {
		this.lstUsuarios = lstUsuarios;
	}
	
	
	
	
	
}
