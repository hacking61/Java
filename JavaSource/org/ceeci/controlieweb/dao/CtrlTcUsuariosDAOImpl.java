package org.ceeci.controlieweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.ceeci.controlieweb.dto.CtrlTcUsuariosDTO;
import org.ceeci.dbconnection.dao.DAO;

/**
 * DAO que implementa el manejo de la tabla ctrl_tc_usuarios
 * 
 * @author Israel Aguilar Hernández
 * @version 1.0
 * @since 15/May/2012
 *
 */
public class CtrlTcUsuariosDAOImpl extends DAO implements CtrlTcUsuariosDAO {
	
	/* Variables */
	private Connection			con							= null	;
	
	/* TABLAS  */
	public	static	final	String		TABLA 			= 	"ctrl_tc_usuarios" ;
	
	/* CAMPOS  */
	public	static	final	String		CAMPO_USUARIO	=	"ctrl_chr_usuario"	;
	public	static	final	String		CAMPO_PASSWORD	=	"ctrl_chr_passwd"	;
	public	static	final	String		CAMPO_PERFILID	=	"ctrl_int_perfilId"	;
	
	/* QUERIES */
	
	public	static	final	String		CONSULTA_TODOS	=	" select "		+
															CAMPO_USUARIO	+	","	+
															CAMPO_PASSWORD	+	","	+
															CAMPO_PERFILID	+	
															" from "		+
															TABLA			;
	
	public	static	final	String		INSERTAR		=	" insert into "	+	
															TABLA			+	"("	+
															CAMPO_USUARIO	+	","	+
															CAMPO_PASSWORD	+	","	+
															CAMPO_PERFILID	+	")" +
															" values(?,?,?)";		
															
	
	/**
	 * Constructor
	 */
	public CtrlTcUsuariosDAOImpl() {
		try {
			 con 		= 	creaConexion();
			 
		 }catch (Exception e) 
		 {
			e.printStackTrace(System.out);
			System.out.println("No se pudo realizar la conexion a la BD")	; 
		}
	}

	/* (non-Javadoc)
	 * @see org.ceeci.controlieweb.dao.CtrlTcUsuariosDAO#getAll()
	 */
	
	public List<CtrlTcUsuariosDTO> getAll() throws Exception {
		PreparedStatement 	ps 	= null	;
		ResultSet			rs	= null	;
		ps	=	con.prepareStatement( CONSULTA_TODOS ) ;
		List<CtrlTcUsuariosDTO> lstResult = new ArrayList<CtrlTcUsuariosDTO>() ;
		
		try {			
			rs = ps.executeQuery () ;			
			while ( rs.next() ) {
				CtrlTcUsuariosDTO dto= getDTO ( rs ) ;
				lstResult.add ( dto ) ; 
			}			
		} catch ( SQLException e ) {
			e.printStackTrace( System.out ) ;
			System.out.println ( "CONTROLIEWEB >> Ocurrio un error al intentar consultar todos los registros" ) ;
			throw e	;
		} finally {
			rs.close() ;
			ps.close() ;
		}
		
		return lstResult;
	}
	
	
	

	/* (non-Javadoc)
	 * @see org.ceeci.controlieweb.dao.CtrlTcUsuariosDAO#save(org.ceeci.controlieweb.dto.CtrlTcUsuariosDTO)
	 */
	
	public void save(CtrlTcUsuariosDTO dto) throws Exception {	
		PreparedStatement	ps							= null	;
		ps					=	con.prepareStatement( INSERTAR ) ;
		try {		
			// Campos a insertar
			ps.setString	( 1, dto.getCtrlChrUsuario() 	) ;
			ps.setString 	( 2, dto.getCtrlChrPasswd() 	) ;
			ps.setInt		( 3, dto.getCtrlIntPerfilId()  	) ;	
			ps.executeUpdate()	;
		} catch ( SQLException e ) {
			e.printStackTrace( System.out ) ;
			System.out.println( "CONTROLIEWEB >> Ocurrio un error al intentar insertar un registro en la tabla" ) ;
			throw e	;
		} finally {			
			ps.close() ;
		}
		
	}
	
	/**
	 * Recupera un registro y lo devuelve en un DTO
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	private	CtrlTcUsuariosDTO	getDTO( ResultSet rs ) throws SQLException {
		CtrlTcUsuariosDTO dto	= new CtrlTcUsuariosDTO() ;
		dto.setCtrlChrUsuario	( rs.getString  ( CAMPO_USUARIO  ) ) ;
		dto.setCtrlChrPasswd	( rs.getString  ( CAMPO_PASSWORD ) ) ;
		dto.setCtrlIntPerfilId	( rs.getInt		( CAMPO_PERFILID ) ) ;
		return dto	;
	}

}
