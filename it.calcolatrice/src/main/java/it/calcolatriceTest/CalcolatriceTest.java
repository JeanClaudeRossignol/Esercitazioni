package it.calcolatriceTest;


import static org.junit.jupiter.api.Assertions.assertEquals;



import it.calcolatrice.Calcolatrice;
import org.junit.jupiter.api.Test;


public class CalcolatriceTest {
	
	int a=2;
	int b=3;
	double delta=0.0001;
	
	
	Calcolatrice calcolatrice = new Calcolatrice();
	
	
	
	@Test
	public void sommaTest() {		
		assertEquals(5, calcolatrice.somma(a,b));
	}
	
	
	@Test
	public void sottrazioneTest() {		
		assertEquals(-1, calcolatrice.sottrazione(a,b));
	}
	
	@Test
	public void moltiplicazioneTest() {
		assertEquals(6, calcolatrice.moltiplicazione(a,b));
	}
	
	
	@Test
	public void divisioneTest() {
		double c=2.0/3.0;
		assertEquals(c, calcolatrice.divisione(2.0,3.0),delta);
	}
	
	@Test()
	public void testDivisione0() {
		assertEquals(IllegalArgumentException.class.getModifiers(),calcolatrice.divisione(8, 0), delta);
	}
	
	//Ho creato la funzione potenza in maniera logica con un ciclo for, ma per l'incremento della variabile i potrebbe 
	//eseguire un ciclo in più. Facile da correggere ma così verifico l'uso dei Test.
	@Test
	public void potenzaTest() {
		assertEquals(8, calcolatrice.potenza(a,b));
	}
	

	@Test
	public void mediaTest() {
		assertEquals(2.5, calcolatrice.media(a,b),delta);
	}
	
	
	
	


}
