package org.ceeci.controlieweb.business;

import java.util.ArrayList;
import java.util.List;

import org.ceeci.controlieweb.bean.PerfilBean;

/**
 * Clase que implementa el manejo de perfiles de usuario
 * 
 * @author Israel Aguilar Hernández
 * @version 1.0
 * @since 15/May/2012
 *
 */
public class PerfilesDelegateImpl implements PerfilesDelegate {

	
	public List<PerfilBean> cargaTodos() {
		
		/* De momento se crean a pata los perfiles
		   pero lo correcto es que se busquen en la BD */
		List<PerfilBean> lstPer = new ArrayList<PerfilBean>() ;
		
		PerfilBean pBean = new PerfilBean() ;
		pBean.setPerfilId(1) ;
		pBean.setDescripcion("Administrador") ;
		lstPer.add( pBean ) ;
		
		PerfilBean ppBean = new PerfilBean() ;
		ppBean.setPerfilId(2) ;
		ppBean.setDescripcion("Usuario") ;
		lstPer.add( ppBean ) ;
		
		return lstPer;
	}

}
