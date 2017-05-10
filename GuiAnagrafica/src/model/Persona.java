package model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;


public class Persona implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//attributi
	private String nome;
	private String cognome;
	private GregorianCalendar dataNascita;
	private String luogoNascita;
	private Sesso sesso;
	
	public Persona() {
		//logica di azzeramento
		this.dataNascita = new GregorianCalendar();
		this.sesso=Sesso.ALTRO;
	}

	public Persona(String nome, String cognome) {
		this();
		this.nome = nome;
		this.cognome = cognome;
	}

	public Persona(String nome, String cognome, GregorianCalendar dataNascita, String luogoNascita) {
		this(nome,cognome);
		this.dataNascita = dataNascita;
		this.luogoNascita = luogoNascita;
	}
	
	public Persona(String nome, String cognome, GregorianCalendar dataNascita, String luogoNascita, Sesso sesso) {
		this(nome,cognome,dataNascita,luogoNascita);
		this.sesso = sesso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public GregorianCalendar getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(GregorianCalendar dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getLuogoNascita() {
		return luogoNascita;
	}

	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}
		
	public Sesso getSesso() {
		return sesso;
	}

	public void setSesso(Sesso sesso) {
		this.sesso = sesso;
	}

	public int eta(){
		GregorianCalendar oggi = new GregorianCalendar();
		
		int e=oggi.get(Calendar.YEAR)-dataNascita.get(Calendar.YEAR);
		
		if(dataNascita.get(Calendar.MONTH)>oggi.get(Calendar.MONTH) 
				|| ((dataNascita.get(Calendar.MONTH)==oggi.get(Calendar.MONTH) 
				&& dataNascita.get(Calendar.DAY_OF_MONTH)>oggi.get(Calendar.DAY_OF_MONTH))))
			e--;		
		return e;		
	}public String dataLineare() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		String d = sdf.format(dataNascita.getTime());
		if(dataNascita!=null){
			d = sdf.format(dataNascita.getTime());
		}
		return d;
	}

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.nome);
        hash = 59 * hash + Objects.hashCode(this.cognome);
        hash = 59 * hash + Objects.hashCode(this.dataNascita);
        hash = 59 * hash + Objects.hashCode(this.luogoNascita);
        hash = 59 * hash + Objects.hashCode(this.sesso);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cognome, other.cognome)) {
            return false;
        }
        if (!Objects.equals(this.luogoNascita, other.luogoNascita)) {
            return false;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        if (!Objects.equals(sdf.format(this.dataNascita.getTime()), sdf.format(other.dataNascita.getTime()))) {
            return false;
        }
        if (this.sesso != other.sesso) {
            return false;
        }
        return true;
    }

    

	@Override
	public String toString() {
		
			
		return ""
				+ (nome!=null ? "nome: " + nome : "") 
				+ (cognome != null ? "\ncognome: " + cognome : "") 
				+ (dataNascita!=null ? "\ndata nascita: " + dataLineare() : "")
				+ (luogoNascita!=null ? "\nluogo nascita: "+ luogoNascita : "")
				+ (dataNascita != null ? "\nsesso: " + sesso : "")
				//+ (dataNascita != null ? "\neta: " + eta() : "")
				;
	}
	
	
	
}
