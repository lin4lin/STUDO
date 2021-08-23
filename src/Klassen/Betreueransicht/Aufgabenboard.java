package Klassen.Betreueransicht;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import Klassen.Studentenansicht.StudentenTermin;

public class Aufgabenboard {
	
	private ArrayList<Aufgabe> Aufgaben;

	public Aufgabenboard() {
		this.Aufgaben = new ArrayList<Aufgabe>();
	}

	public void hinzufuegen(Aufgabe a) {
		this.Aufgaben.add(a);
	}

	public void loeschen(Aufgabe a) {
		this.Aufgaben.remove(a);
	}
	
	public void loeschen(int idx) {
		this.Aufgaben.remove(idx);
	}
	
	public void bearbeiten(Aufgabe a) {
		int idx = this.Aufgaben.indexOf(a);
		this.Aufgaben.set(idx, a);
	}

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
