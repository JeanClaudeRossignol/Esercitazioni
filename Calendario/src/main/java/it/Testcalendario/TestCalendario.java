package it.Testcalendario;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import it.calendario.Calendario;
import it.calendario.Evento;

public class TestCalendario {
	
	@Test
	public void testaddEvento() {
		Calendario calendario = new Calendario(); 
		Evento evento = new Evento("nome ","descrizione",1,1,1);
		
		calendario.addEvento(evento);
		ArrayList<Evento> eventi=calendario.getEventi();
		
		
		assertEquals("nome",eventi.get(0).getNome());
		assertEquals("descrizione",eventi.get(0).getDescrizione());
		assertEquals(1,eventi.get(0).getGiorno());
		assertEquals(1,eventi.get(0).getMese());
		assertEquals(1,eventi.get(0).getAnno());
	}

}
