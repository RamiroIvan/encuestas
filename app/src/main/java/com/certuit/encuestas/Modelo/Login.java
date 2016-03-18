package com.certuit.encuestas.Modelo;

/**
 * Created by Ivane on 11/03/16.
 */
public class Login {

    private String usuario;
    private String contraseña;
    private String token;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Login(String usuario, String contraseña, String token) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.token = token;
    }
}
