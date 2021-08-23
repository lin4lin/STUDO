package Klassen.Betreueransicht;

import java.util.Date;

public class Bewertungsbogen {
private String student;
private Date datum;
private String bewertung;

// Konstruktor
public Bewertungsbogen(String student, Date datum, String bewertung) {
	this.student = student;
	this.datum = datum;
	this.bewertung = bewertung;
}

public Bewertungsbogen() {
}


// Getters & Setters

public String getStudent() {
	return student;
}

public void setStudent(String student) {
	this.student = student;
}

public Date getDatum() {
	return datum;
}

public void setDatum(Date datum) {
	this.datum = datum;
}

public String getBewertung() {
	return bewertung;
}

public void setBewertung(String bewertung) {
	this.bewertung = bewertung;
}


}
