package Klassen.Studentenansicht;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class PTBBoard {
	
	private ArrayList<PTBItem> Items;
	
	// Konstruktor
	public PTBBoard() {
		this.Items = new ArrayList<PTBItem>();
	}

	// PTB Item zu Board hinzufuegen
	public void hinzufuegen(PTBItem item) {
		this.Items.add(item);
	}
	
	// Listenelement anhand von Item löschen
	public void loeschen(PTBItem item) {
		this.Items.remove(item);
	}
	
	// Listenelement anhand von Index
	public void loeschen(int idx) {
		this.Items.remove(idx);
	}
	
	// Listenelement updaten anhand von Index
	public void bearbeiten(PTBItem item) {
		int idx = this.Items.indexOf(item);
		this.Items.set(idx, item);
	}
	
	// Visuelle Konsolenausgabe der Item-Liste
	public void anzeigen() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		if (this.Items.size() > 0) {
			for (PTBItem i : this.Items) {
				System.out.println("Index: " + Integer.toString(this.Items.indexOf(i)));
				System.out.println("Thema: " + i.getThema());
				System.out.println("Datum: " + dateFormat.format(i.getDatum()));
				System.out.println("Semester: " + Integer.toString(i.getSemester()));
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
	
	public ArrayList<PTBItem> getItems() {
		return Items;
	}

	public void setItems(ArrayList<PTBItem> items) {
		Items = items;
	}
	
}
