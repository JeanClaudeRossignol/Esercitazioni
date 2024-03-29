package it.calendario;

import java.util.ArrayList;

public class Calendario {
	
	private String nome;
	private String descrizione;
	
	private ArrayList<Evento> eventi;
	
	

	public Calendario() {
		super();
	
	}
	
	

	public Calendario(String nome, String descrizione) {
		
		this.nome = nome;
		this.descrizione = descrizione;		
		eventi = new ArrayList<Evento>();
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public ArrayList<Evento> getEventi() {
		return eventi;
	}

	public void setEventi(ArrayList<Evento> eventi) {
		this.eventi = eventi;
	}
	
	
	
	public void addEvento(Evento evento) {
		
		eventi.add(evento);
		
	}
	
	public void removeEvento(Evento evento) {
		
		
	            eventi.remove(evento);
	            System.out.println("Hai rimesso l'evento selezionato");
	          	    }

	
	
	public void showEventi() {
		System.out.println(eventi);
	}
	
}
