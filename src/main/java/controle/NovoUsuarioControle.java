/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import dao.Dao;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import modelo.Usuario;

/**
 *
 * @author CC18852966730
 */
@Named
@ViewScoped
public class NovoUsuarioControle implements Serializable{
    private Usuario usuario;
    private Dao<Usuario> dao;

    @PostConstruct
    public void iniciar() {
        usuario = new Usuario();
        dao = new Dao(Usuario.class);
    }

    public void salvar() {
        dao.inserir(usuario);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
