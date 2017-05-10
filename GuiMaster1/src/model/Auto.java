package model;

import java.io.Serializable;



public class Auto implements Serializable{
       private static final long serialVersionUID = 1L;
	

	private String marca;
	private String modello;
	private int cilindrata;
	private Alimentazione alimentazione;
	private String colore;
	
	public Auto() {
	}

	public Auto(String marca, String modello, int cilindrata, Alimentazione alimentazione, String colore) {
		this.marca = marca;
		this.modello = modello;
		this.cilindrata = cilindrata;
		this.alimentazione = alimentazione;
		this.colore = colore;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}

	public Alimentazione getAlimentazione() {
		return alimentazione;
	}

	public void setAlimentazione(Alimentazione alimentazione) {
		this.alimentazione = alimentazione;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}
	
	public int velocitaMax(){
		
		int v = cilindrata/10;
		
		switch(alimentazione){
		case BENZINA: v+=40;break;
		case DIESEL: v+=20;break;
		case GPL: v+=0;break;
		case METANO: v-=10;break;
		case ELETTRICA: v-=30;break;		
		}
		
		return v;
	}

	@Override
	public String toString() {
		return "Marca : " + marca+"\n" 
				+ "Modello : " + modello+"\n" 
				+ "Cilindrata : " + cilindrata+"\n" 
				+ "Alimentazione : "+ alimentazione+"\n" 
				+ "Colore : " + colore+"\n" 
				+ "Velocita max : " + velocitaMax()+"KM/H"+"\n\n"
				;
	}
	
	
	
}
