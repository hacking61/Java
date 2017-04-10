package org.ceeci.controlieweb.helper;

import java.util.ArrayList;
import java.util.List;

import org.ceeci.controlieweb.bean.UsuarioBean;
import org.ceeci.controlieweb.dto.CtrlTcUsuariosDTO;
import org.ceeci.controlieweb.form.UsuariosForm;
import org.ceeci.controlieweb.util.Constantes;

/**
 * Clase Helper para la transformacion entre objetos de usuario
 * @author Israel Aguilar Hernández
 * @version 1.0
 * @since 15/May/2012
 *
 */
public class UsuariosHelper {
	
	/**
	 * Convierte los datos de un form a un dto de usuarios
	 * @param form
	 * @return
	 */
	public	static	CtrlTcUsuariosDTO form2dto ( UsuariosForm form ) {
		CtrlTcUsuariosDTO dto = new CtrlTcUsuariosDTO() ;
		dto.setCtrlChrUsuario	( form.getUsuario() 	) ;
		dto.setCtrlChrPasswd	( form.getUsuario() 	) ;
		dto.setCtrlIntPerfilId	( form.getPerfilId()	) ;
		return dto	;
	}
	
	/**
	 * Convierte un dto a un bean de usuario
	 * @param dto
	 * @return
	 */
	public	static	UsuarioBean	dto2bean ( CtrlTcUsuariosDTO dto ) {
		UsuarioBean bean = new UsuarioBean() ;
		bean.setNombreUsuario( dto.getCtrlChrUsuario() ) ;
		bean.setContrasena( dto.getCtrlChrPasswd() ) ;
		bean.setPerfilId( dto.getCtrlIntPerfilId() ) ;
		
		/* 
		 	Esta parte deberia ir a la BD y sacar los perfiles
		 	como simple ejemplo se hace manual
		 */
		String strDescripcion = Constantes.CADENA_VACIA ;
		if ( dto.getCtrlIntPerfilId() == 1 ) strDescripcion = "Administrador" ;
		if ( dto.getCtrlIntPerfilId() == 2 ) strDescripcion = "Usuario" ;
		/* ************ */
		
		bean.setPerfilDescripcion( strDescripcion ) ;
		return bean	;
	}
	
	/**
	 * Convierte una lista de DTOs a una lista de beans de usuario
	 * @param lstDTO
	 * @return
	 */
	public	static	List<UsuarioBean> listaDTO2listaBean ( List<CtrlTcUsuariosDTO> lstDTO ) {
		List<UsuarioBean> lstBean = new ArrayList<UsuarioBean>() ;
		for ( CtrlTcUsuariosDTO dto : lstDTO ) {
			UsuarioBean bean = dto2bean ( dto ) ;
			lstBean.add ( bean ) ;
		}
		return lstBean ;
	}
}
