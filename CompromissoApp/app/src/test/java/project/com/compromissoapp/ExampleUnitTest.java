package project.com.compromissoapp;

import org.junit.Test;

import java.time.LocalDate;

import project.com.compromissoapp.Controller.CompromissoController;
import project.com.compromissoapp.Model.Compromisso;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    CompromissoController controller;

    @Test
    public void insert_test() throws  Exception{
        Compromisso comp = new Compromisso();
        comp.setNomeCompromisso("Compromisso Teste");
        comp.setPrioridade(1);
        comp.setData(LocalDate.parse("2018-05-08"));
        controller.newLemtebrete(comp);
    }
    @Test
    public void recovery_all_test() throws  Exception{
        System.out.println(controller.getCompromissos());
    }
    @Test
    public void recovery_open_test() throws  Exception{
        System.out.println(controller.getOpenCompromissos());
    }
    @Test
    public void recovery_data_test() throws  Exception{
        System.out.println(controller.getCompromissosData("2018-05-08"));
    }
    @Test
    public void recovery_concluidos_test() throws  Exception{
        System.out.println(controller.getCloseCompromissos());
    }
    @Test
    public void update_test() throws  Exception{
        Compromisso comp = new Compromisso();


        comp.setNomeCompromisso("Compromisso Teste");
        comp.setPrioridade(1);
        comp.setData(LocalDate.parse("2018-05-08"));
        controller.newLemtebrete(comp);
    }

    @Test
    public void delete_test() throws  Exception{
        Compromisso comp = new Compromisso();


        comp.setNomeCompromisso("Compromisso Teste");
        comp.setPrioridade(1);
        comp.setData(LocalDate.parse("2018-05-08"));
        controller.newLemtebrete(comp);
    }




}