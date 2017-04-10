<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<%@page import="org.ceeci.controlieweb.util.Constantes" %>

<html>
	<head>
		<title>:: ControlIEWeb :: Modulo de usuarios</title>
	</head>
	<body>
		<h1>Usuarios</h1><hr/>
		
		<html:form action="/UsuariosGuardarAction.do">
		<table>
			<tr>
				<td valign="top">
				
					<logic:present name="<%=Constantes.AVISO_SESION_GUARDAR%>">
						<font color="red">
							<bean:write name="<%=Constantes.AVISO_SESION_GUARDAR%>"/><br/>
						</font>
					</logic:present>
					
					<table>
						<tr>
							<td>Usuario:</td>
							<td><html:text property="usuario"/></td>
						</tr>
						<tr>
							<td>Password:</td>
							<td><html:password property="password"/></td>
						</tr>
						<tr>
							<td>Perfil:</td>
							<td>
								<html:select property="perfilId">
									<option value=0>-Selecciona una opcion-</option>
									<html:optionsCollection  property="lstPerfiles" value="perfilId" label="descripcion"/>
								</html:select>
							</td>
						</tr>
						<tr>
							<td colspan=2><html:submit value="Guardar"/></td>
						</tr>
					</table>
					
				
				</td>
				<td valign="top">
					<table border=1>
						<thead>
							<tr>
								<th>Usuario</th>
								<th>Password</th>
								<th>Perfil</th>
							</tr>
						</thead>
						<tbody>
							<logic:iterate name="UsuariosForm" property="lstUsuarios" id="usuarioBean">
								<tr>
									<td><bean:write name="usuarioBean" property="nombreUsuario"/></td>
									<td><bean:write name="usuarioBean" property="contrasena"/></td>
									<td><bean:write name="usuarioBean" property="perfilDescripcion"/></td>
								</tr>
							</logic:iterate>
						</tbody>
					</table>
				</td>
			</tr>
		</table>
		</html:form>
		
		
	</body>
</html>