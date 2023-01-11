package it.calcolatrice;

public class Calcolatrice {
	
	public int somma(int a, int b) {
		return a+b;		
	}

	public int sottrazione(int a, int b) {
		return a-b;
	}
	
	public int moltiplicazione(int a,int b) {
		return a*b;
	}
	
	public double divisione(double a, double b) {
		
		if(b==0) {
			throw new IllegalArgumentException("Non puoi dividere per zero");
		}
		
		return a/b;
	}
	
	public int potenza(int a, int b) {
		int c=1;
		for(int i=0;i<b;i++) {
			c=c*a;			
		}
		return c;		
	}
	
	public float media(int a, int b) {
		return (a+b)/2;
	}
	
}
