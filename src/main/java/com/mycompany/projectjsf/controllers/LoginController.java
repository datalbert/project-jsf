/**
 * 
 */
package com.mycompany.projectjsf.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author albertoavilafernandez Clase que permite controlar el funcionamiento
 *         con la pantalla de login.xhtml
 *
 */
@ManagedBean
public class LoginController {

	private String usuario;

	private String password;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void ingresar() {
		System.out.println("Usuario: " + usuario);
		if (usuario.equals("alberto") && password.equals("1234")) {
			try {
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				FacesContext.getCurrentInstance().addMessage("formLogin:txtusuario",
						new FacesMessage(FacesMessage.SEVERITY_FATAL, "La página no existe", password));

				e.printStackTrace();
			}

		} else {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtusuario",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario incorrecto", password));

		}
	}
	
	private void redireccionar(String pagina) throws IOException {
		
		ExternalContext ec=FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}

}
