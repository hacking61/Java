package org.ceeci.controlieweb.business;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.ceeci.controlieweb.bean.PerfilBean;
import org.ceeci.controlieweb.bean.UsuarioBean;
import org.ceeci.controlieweb.dao.CtrlTcUsuariosDAO;
import org.ceeci.controlieweb.dao.CtrlTcUsuariosDAOImpl;
import org.ceeci.controlieweb.dto.CtrlTcUsuariosDTO;
import org.ceeci.controlieweb.form.UsuariosForm;
import org.ceeci.controlieweb.helper.UsuariosHelper;
import org.ceeci.controlieweb.util.Constantes;

/**
 * Clase Business Delegate para el manejo de usuarios
 * 
 * @author Israel Aguilar Hernández
 * @version 1.0
 * @since 15/May/2012
 *
 */
public class UsuariosDelegateImpl implements UsuariosDelegate {

	
	public void cargarInformacion(UsuariosForm form )
			throws Exception {
		
		PerfilesDelegate  perfilesDelegate 	= new PerfilesDelegateImpl() 	;
		CtrlTcUsuariosDAO ctrlTcUsuariosDAO	= new CtrlTcUsuariosDAOImpl()	;
		
		List<PerfilBean> 		lstPerfiles 	= perfilesDelegate.cargaTodos() ;
		
		List<CtrlTcUsuariosDTO> lstUsuariosDTO	= ctrlTcUsuariosDAO.getAll()	;
		List<UsuarioBean>		lstUsuariosBean = UsuariosHelper.listaDTO2listaBean( lstUsuariosDTO ) ;
		
		form.setLstPerfiles( lstPerfiles ) ; 
		form.setLstUsuarios( lstUsuariosBean ) ;
		form.resetCaptura() ;
		
	}

	
	public void guardar(UsuariosForm form, HttpServletRequest request)
			throws Exception {
		
		CtrlTcUsuariosDAO ctrlTcUsuariosDAO = new CtrlTcUsuariosDAOImpl() ;
		CtrlTcUsuariosDTO dto = UsuariosHelper.form2dto ( form ) ;
		ctrlTcUsuariosDAO.save ( dto ) ;
		
		String	strAviso = "El usuario ::| " + dto.getCtrlChrUsuario() + " |:: fue guardado correctamente"	;
		
		if ( request.getSession().getAttribute( Constantes.AVISO_SESION_GUARDAR ) != null )
			request.getSession().removeAttribute( Constantes.AVISO_SESION_GUARDAR ) ;
		request.getSession().setAttribute(Constantes.AVISO_SESION_GUARDAR, strAviso ) ; 
		
	}
	

	

}
