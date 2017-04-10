package org.ceeci.controlieweb.dao;

import java.util.List;

import org.ceeci.controlieweb.dto.CtrlTcUsuariosDTO;

/**
 * DAO para las operaciones con la tabla ctrl_tc_usuarios
 * 
 * @author Israel Aguilar Hernández
 * @version 1.0
 * @since 15/May/2012
 *
 */
public interface CtrlTcUsuariosDAO {
	
	/**
	 * Consulta todos los registros de la tabla
	 * @return
	 * @throws Exception
	 */
	public	List<CtrlTcUsuariosDTO> getAll() throws Exception ;
	
	/**
	 * Guarda un registro en la tabla
	 * @param dto
	 * @throws Exception
	 */
	public	void	save ( CtrlTcUsuariosDTO dto ) throws Exception ;

}
