package Klassen.Studentenansicht;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class PTBBoard {
	
	private ArrayList<PTBItem> Items;
	
	public PTBBoard() {
		this.Items = new ArrayList<PTBItem>();
	}

	public void hinzufuegen(PTBItem item) {
		this.Items.add(item);
	}
	
	public void loeschen(PTBItem item) {
		this.Items.remove(item);
	}
	
	public void loeschen(int idx) {
		this.Items.remove(idx);
	}
	
	public void bearbeiten(PTBItem item) {
		int idx = this.Items.indexOf(item);
		this.Items.set(idx, item);
	}
	
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
	
	public ArrayList<PTBItem> getItems() {
		return Items;
	}

	public void setItems(ArrayList<PTBItem> items) {
		Items = items;
	}
	
}
