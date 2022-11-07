import Controller.ApplicationController;
import Controller.PerguntaController;
import Controller.ProvaController;
import Controller.TelaController;
import SystemProvas1.Pergunta;
import SystemProvas1.Usuario;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ProvaTest {


    private Process logger;


    @AfterEach
    public void printMessage(){
       System.out.println ("Obrigada!");
    }


    @Test
    public void provaTest(){
        Usuario usuario = new Usuario();
        TelaController Tela = Mockito.mock(TelaController.class);
        Mockito.when(Tela.getOpcao()).thenReturn(1);
        ProvaController prova = new ProvaController(new Pergunta());








    }




}

