package it.calendario;


public class Main {

	public static void main(String[] args) {
		
		
		Calendario calendario=new Calendario("compleanni","calendario compleanni");
		Evento evento=new Evento("compleanno","mio compleanno",27,9,2023);
		Evento evento2=new Evento("compleanno","compleanno GAS",30,12,2023);
		
		calendario.addEvento(evento);
		calendario.addEvento(evento2);
		calendario.showEventi();
	}
	
	

}
