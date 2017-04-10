package org.ceeci.controlieweb.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.ceeci.controlieweb.business.UsuariosDelegate;
import org.ceeci.controlieweb.business.UsuariosDelegateImpl;
import org.ceeci.controlieweb.form.UsuariosForm;
import org.ceeci.controlieweb.util.Constantes;

/**
 * Struts Action para las acciones del modulo de usuarios
 * 
 * @author Israel Aguilar Hernández
 * @version 1.0
 * @since 15/May/2012
 *
 */
public class UsuariosAction extends Action {
	
	public ActionForward execute(	ActionMapping mapping, 
									ActionForm form,
									HttpServletRequest request, 
									HttpServletResponse response ) throws Exception {
		
		UsuariosForm 		uForm 				= ( UsuariosForm ) form ;
		UsuariosDelegate 	usuariosDelegate 	= new UsuariosDelegateImpl() ;
		
		// Verificado la accion a ejecutar 
		if ( mapping.getPath().trim().equalsIgnoreCase( Constantes.USUARIOS_GUARDAR_ACTION ) ) 
			usuariosDelegate.guardar( uForm, request ) ;
		
		usuariosDelegate.cargarInformacion( uForm ) ;
		
		return mapping.findForward( Constantes.EXITO ) ;
		
	}

}
