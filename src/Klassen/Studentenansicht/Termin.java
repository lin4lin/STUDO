package Klassen.Studentenansicht;

import java.util.Date;

public class Termin {
	private Date datum;
	private String bezeichnung;
	private String beschreibung;
	
	//Konstruktor
	public Termin() {}

	public Termin(Date datum, String bezeichnung, String beschreibung) {
		super();
		this.datum = datum;
		this.bezeichnung = bezeichnung;
		this.beschreibung = beschreibung;
	}

	//Getters & Setters
	
	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

}
