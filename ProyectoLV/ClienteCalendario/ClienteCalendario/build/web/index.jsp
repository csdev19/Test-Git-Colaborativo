<%-- 
    Document   : index
    Created on : 28/09/2010, 09:54:22 PM
    Author     : Ewin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Web Services - Calendario Innovacorp</title>
        <link href="style.css" rel="stylesheet" type="text/css" media="screen" />
        <SCRIPT language=JavaScript type="text/javascript" src="funciones.js"> </SCRIPT>
        <script  language="Javascript" type="text/javascript">
        function ValidarNumeros()
        {
            var key = window.event.keyCode;

            if (key < 48 || key > 57)
            {
                     window.event.keyCode=0;
            }
        }

	function ValidaRegistrar()
	 {
		//capturamos los valores de las cajas de texto
		var nom=document.frmRegistro.txtNombre.value;
		var pass=document.frmRegistro.txtPass.value;

                if(vacio(nom))
		{
		   alert("Ingresar su nombre de usuario...");
		   document.frmRegistro.txtNombre.focus();
		}
		else if(vacio(pass))
		{
		   alert("Ingrese su contraseña...");
		   document.frmRegistro.txtPass.focus();
		}		
                else
		{
                    document.frmRegistro.action="calendario.jsp";
                    document.frmRegistro.submit();
                }

	}       
</script>
    </head>
    <body>

        <%-- start web service invocation --%><hr/>
        <%
        try {
            servicio.Servidor_Service service = new servicio.Servidor_Service();
            servicio.Servidor port = service.getServidorPort();
             // TODO initialize WS operation arguments here
            java.lang.String nombre = request.getParameter("txtNombre") ;
            java.lang.String pass = request.getParameter("txtPass");
            // TODO process result here
            boolean result = port.login(nombre, pass);
            if (result==true)
            {              
                out.println("<div align=center><b>Proyecto 1. Web Services en Java</b></div>");
            }
            if (result==false)
            {
                out.println("<div align=center><b>Ingrese sus Datos</b></div>");
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        %>
        <%-- end web service invocation --%><hr/>

        <form action="" method="post" name="frmRegistro"  id="frmRegistro">
            <table width="375" border="0" align="center" cellpadding="0" cellspacing="0">
                <tr>
                  <td height="120" colspan="5"><div align="center"><h2>Calendario - Innovacorp - Inicio de Sesión</h2></div></td>
                  </tr>
     
                <tr>
                  <td width="130" height="35" colspan="2" class="etiquetas">Usuario</td>
                  <td width="220" height="35" colspan="3"><input name="txtNombre" type="text" id="txtNombre" size="25"></td>
                </tr>
                <tr>
                  <td width="130" colspan="2" class="etiquetas">Contraseña</td>
                  <td width="220" height="40" colspan="3"><input name="txtPass" type="password" id="txtPass" size="25" /></td>
                </tr>
                <tr align="center">
                    <td>
                    </td>
                    <td>
                      <input name="btnRegistrar" type="button" class="botones" onClick="ValidaRegistrar()" id="btnRegistrar" value="Ingresar" />
                    </td>
                    <td>                    
                    </td>
                    <td>
                        <input name="btnEliminar" type="button"  id="btnPassword" value="¿Contraseña?" />
                    </td>
                </tr>
            </table> 
        </form>
        <br>
        <br>
        <hr/>
            <div align=center><b>Fundamentos en Programación Web. Universidad Estatal a Distancia</b></div>
        <hr/>

    </body>
</html>
