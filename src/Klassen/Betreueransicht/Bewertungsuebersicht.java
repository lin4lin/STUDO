package Klassen.Betreueransicht;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Bewertungsuebersicht {
	
	private ArrayList<Bewertungsbogen> Bewertungen;
	
	public Bewertungsuebersicht() {
		this.Bewertungen = new ArrayList<Bewertungsbogen>();
	}
	
	// Bewertungsbogen zur Liste hinzufuegen
	public void hinzufuegen(Bewertungsbogen b) {
		this.Bewertungen.add(b);
	}

	// Listenelement anhand von Bewertungsbogen löschen
	public void loeschen(Bewertungsbogen b) {
		this.Bewertungen.remove(b);
	}
	
	// Listenelement anhand von index löschen
	public void loeschen(int idx) {
		this.Bewertungen.remove(idx);
	}

	// Listenelement anhand von Bewertungsbogen updaten
	public void bearbeiten(Bewertungsbogen b) {
		int idx = this.Bewertungen.indexOf(b);
		this.Bewertungen.set(idx, b);
	}

	// Visuelle Ausgabe der Elemente als Liste
	public void anzeigen() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		if (this.Bewertungen.size() > 0) {
			for (Bewertungsbogen b : this.Bewertungen) {
				System.out.println("Index: " + Integer.toString(this.Bewertungen.indexOf(b)));
				System.out.println("Student: " + b.getStudent());
				System.out.println("Datum: " + dateFormat.format(b.getDatum()));
				System.out.println("Bewertung: " + b.getBewertung());
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

	// Getters & Setters
	
	public ArrayList<Bewertungsbogen> getBewertungen() {
		return Bewertungen;
	}

	public void setBewertungen(ArrayList<Bewertungsbogen> bewertungen) {
		Bewertungen = bewertungen;
	}

}
