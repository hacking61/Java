package org.ceeci.controlieweb.business;

import java.util.List;

import org.ceeci.controlieweb.bean.PerfilBean;

/**
 * Business Delegate para el manejo de perfiles
 * 
 * @author Israel Aguilar Hernández
 * @version 1.0
 * @since 15/May/2012
 *
 */
public interface PerfilesDelegate {
	
	/**
	 * Carga todos los perfiles de usuario
	 * @return
	 */
	public	List<PerfilBean> cargaTodos() ;

}
