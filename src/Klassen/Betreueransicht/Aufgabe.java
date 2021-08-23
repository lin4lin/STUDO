package Klassen.Betreueransicht;

import java.util.Date;

public class Aufgabe {

	private Date datum;
	private String student;
	private String bezeichnung;
	private String beschreibung;
	

	//Konstruktor
	public Aufgabe(Date datum, String student, String bezeichnung, String beschreibung) {
		super();
		this.datum = datum;
		this.student = student;
		this.bezeichnung  = bezeichnung;
		this.beschreibung = beschreibung;
	}
	
	public Aufgabe() {}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
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
