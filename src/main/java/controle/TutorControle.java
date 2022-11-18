/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import dao.Dao;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import modelo.Tutor;

/**
 *
 * @author CC18852966730
 */
@Named
@javax.faces.view.ViewScoped
public class TutorControle implements Serializable {

    private Tutor tutor;
    private Dao<Tutor> dao;

    @PostConstruct
    public void iniciar() {
        tutor = new Tutor();
        dao = new Dao(Tutor.class);
    }

    public void salvar() {
        dao.inserir(tutor);
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }
}
