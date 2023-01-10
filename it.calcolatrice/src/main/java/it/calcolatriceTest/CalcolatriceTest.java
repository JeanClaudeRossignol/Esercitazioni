package it.calcolatriceTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import it.calcolatrice.Calcolatrice;



public class CalcolatriceTest {
	
	int a=2;
	int b=3;
	
	Calcolatrice calcolatrice = new Calcolatrice();
	
	@Test
	void sommaTest() {		
		assertEquals(5, calcolatrice.somma(a,b));
	}
	
	
	@Test
	void sottrazioneTest() {		
		assertEquals(-1, calcolatrice.sottrazione(a,b));
	}
	
	@Test
	void moltiplicazioneTest() {
		assertEquals(6, calcolatrice.moltiplicazione(a,b));
	}
	
	
	//Ho creato la funzione potenza in maniera logica con un ciclo for, ma per l'incremento della variabile i potrebbe 
	//eseguire un ciclo in più. Facile da correggere ma così verifico l'uso dei Test.
	@Test
	void potenzaTest() {
		assertEquals(8, calcolatrice.potenza(a,b));
	}
	
	@Test
	void mediaTest() {
		assertEquals(2.5, calcolatrice.media(a,b));
	}
	
	
	
	


}
