package Klassen.Studentenansicht;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Kalender {

	private ArrayList<StudentenTermin> Termine;

	
	// Konstruktor
	public Kalender() {
		this.Termine = new ArrayList<StudentenTermin>();
	}
	
	// Termin hinzufuegen
	public void hinzufuegen(StudentenTermin termin) {
		this.Termine.add(termin);
	}
	
	// Termin entfernen
	public void loeschen(StudentenTermin termin) {
		this.Termine.remove(termin);
	}
	
	public void loeschen(int idx) {
		this.Termine.remove(idx);
	}
	
	// Termin bearbeiten
	public void bearbeiten(StudentenTermin termin)
	{
		int idx = this.Termine.indexOf(termin);
		this.Termine.set(idx, termin);
	}
	
	// Alle Kalenderereignisse ausgeben
	public void anzeigen()
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		if (this.Termine.size() > 0) {
			for (StudentenTermin t : this.Termine) {
				System.out.println("Index: " + Integer.toString(this.Termine.indexOf(t)));
				System.out.println("Titel: " + t.getBezeichnung());
				System.out.println("Datum: " + dateFormat.format(t.getDatum()));
				System.out.println("Beschreibung: " + t.getBeschreibung());
				System.out.println("---------------------------------------");
				System.out.println();
			}
		} 
		else {
			System.out.println();
			System.out.println("Keine Einträge vorhanden!");
			System.out.println();
		}
	}

	// Getter und Setter
	public ArrayList<StudentenTermin> getTermine() {
		return Termine;
	}

	public void setTermine(ArrayList<StudentenTermin> termine) {
		Termine = termine;
	}
}

