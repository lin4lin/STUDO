package Klassen.Ausbilderansicht;

import java.util.Date;

public class AusbilderTermin {
	public Date datum;
	private String bezeicnung;
	private String beschreibung;
	
	/**
	 * @param datum
	 * @param bezeicnung
	 * @param beschreibung
	 */
	public AusbilderTermin(Date datum, String bezeicnung, String beschreibung) {
		super();
		this.datum = datum;
		this.bezeicnung = bezeicnung;
		this.beschreibung = beschreibung;
}
	
/**
 *
 */
public AusbilderTermin() {
	super();
}
/**
 * @return the datum
 */
public Date getDatum() {
	return datum;
}
/**
 * @param datum the datum to set
 */
public void setDatum(Date datum) {
	this.datum = datum;
}
/**
 * @return the bezeicnung
 */
public String getBezeicnung() {
	return bezeicnung;
}
/**
 * @param bezeicnung the bezeicnung to set
 */
public void setBezeicnung(String bezeicnung) {
	this.bezeicnung = bezeicnung;
}
/**
 * @return the beschreibung
 */
public String getBeschreibung() {
	return beschreibung;
}
/**
 * @param beschreibung the beschreibung to set
 */
public void setBeschreibung(String beschreibung) {
	this.beschreibung = beschreibung;
}
}
