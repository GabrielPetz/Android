package project.com.compromissoapp.Controller;

import android.support.annotation.NonNull;

import java.time.LocalDate;
import java.util.List;

import project.com.compromissoapp.DAO.CompromissoDAO;
import project.com.compromissoapp.Model.Compromisso;

/**
 * Created by User on 09/05/2018.
 */

public class CompromissoController {
    CompromissoDAO dao;

    public List<Compromisso> getCompromissos() {
        return dao.getCompromissos();
    }

    public List<Compromisso> getOpenCompromissos() {
        return dao.getOpenCompromissos();
    }

    public List<Compromisso> getCloseCompromissos(){ return dao.getCloseCompromissos(); }

    public List<Compromisso> getCompromissosData(String data) {return dao.getCompromissosData(LocalDate.parse(data));}

    public void insertAll(Compromisso comp) {
        dao.insertAll(comp);
    }

    public void newLemtebrete(Compromisso comp) {
        dao.newLemtebrete(comp);
    }

    public int deleteCompromissoId(Integer id) {
        return dao.deleteCompromissoId(id);
    }

    public int deleteCompromissosConcluidos(String data) {return dao.deleteCompromissosConcluidos(LocalDate.parse(data));}

    public int setConcluido(Integer id) {
        return dao.setConcluido(id);
    }

    public int updateCompromisso(Compromisso comp) {
        return dao.updateCompromisso(comp);
    }
}
