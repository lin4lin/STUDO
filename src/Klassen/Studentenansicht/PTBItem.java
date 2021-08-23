package Klassen.Studentenansicht;

import java.util.Date;

public class PTBItem {
	
	private String thema;
	private int semester;
	private Date datum;
	
	// Konstruktor
	public PTBItem(String thema, int semester, Date datum) {
		this.thema = thema;
		this.semester = semester;
		this.datum = datum;
	}
	
	// Getters & Setters

	public String getThema() {
		return thema;
	}

	public void setThema(String thema) {
		this.thema = thema;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}
	
}
