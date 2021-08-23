package Klassen.Betreueransicht;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import Klassen.Studentenansicht.Termin;

public class Aufgabenboard {
	
	private ArrayList<Aufgabe> Aufgaben;

	// Konstruktor
	public Aufgabenboard() {
		this.Aufgaben = new ArrayList<Aufgabe>();
	}

	// Listenelement hinzufuegen
	public void hinzufuegen(Aufgabe a) {
		this.Aufgaben.add(a);
	}
	
	// Listenelement loeschen anhand von Aufgabe
	public void loeschen(Aufgabe a) {
		this.Aufgaben.remove(a);
	}
	
	// Listenelement loeschen anhand von index
	public void loeschen(int idx) {
		this.Aufgaben.remove(idx);
	}
	
	// Listenelement anhand von Aufgabe bearbeiten
	public void bearbeiten(Aufgabe a) {
		int idx = this.Aufgaben.indexOf(a);
		this.Aufgaben.set(idx, a);
	}
	
	// Liste als visuelle Ausgabe formatieren
	public void anzeigen() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		if (this.Aufgaben.size() > 0) {
			for (Aufgabe a : this.Aufgaben) {
				System.out.println("Index: " + Integer.toString(this.Aufgaben.indexOf(a)));
				System.out.println("Bezeichnung: " + a.getBezeichnung());
				System.out.println("Student: " + a.getStudent());
				System.out.println("Datum: " + dateFormat.format(a.getDatum()));
				System.out.println("Beschreibung: " + a.getBeschreibung());
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

}
