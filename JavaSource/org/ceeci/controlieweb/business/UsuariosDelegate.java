package org.ceeci.controlieweb.business;

import javax.servlet.http.HttpServletRequest;

import org.ceeci.controlieweb.bean.UsuarioBean;
import org.ceeci.controlieweb.form.UsuariosForm;

/**
 * Interfaz para el manejo de usuarios
 * 
 * @author Israel Aguilar Hernández
 * @version 1.0
 * @since 15/May/2012
 *
 */
public interface UsuariosDelegate {
	
	/**
	 * Carga informacion necesaria para mostrar en el formulario vacio
	 * @param form
	 * @param request
	 * @throws Exception
	 */
	public	void	cargarInformacion ( UsuariosForm form ) throws Exception ;

	/**
	 * Guardar un registro a la BD
	 * @param form
	 * @param request
	 * @throws Exception
	 */
	public	void	guardar ( UsuariosForm form, HttpServletRequest request ) throws Exception ;
	
}
