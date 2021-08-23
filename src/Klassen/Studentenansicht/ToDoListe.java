package Klassen.Studentenansicht;

import java.util.ArrayList;

public class ToDoListe {

	public ArrayList<ToDoItem> Items;
	
	// Konstruktor
	public ToDoListe() {
		this.Items = new ArrayList<ToDoItem>();
	}
	
	// Todo Item hinzufuegen
	public void hinzufuegen(ToDoItem todo)
	{
		this.Items.add(todo);	
	}
	
	// Todo Item loeschen per Item-Referenz
	public void loeschen(ToDoItem todo)
	{
		this.Items.remove(todo);
	}
	
	// Todo Item loeschen per Listen-Index
	public void loeschen(int idx)
	{
		this.Items.remove(idx);
	}
	
	// Todo Item innerhalb der Liste updaten
	public void bearbeiten(ToDoItem todo)
	{
		int idx = this.Items.indexOf(todo);
		this.Items.set(idx, todo);
	}
	
	// Gesamte Todo-Liste visuell ausgeben 
	public void anzeigen() {
		if (this.Items.size() > 0) {
			for (ToDoItem i : this.Items) {
				System.out.println("Index: " + Integer.toString(this.Items.indexOf(i)));
				System.out.println("Beschreibung: " + i.getBeschreibung());
				System.out.println("Fertig?: " + Boolean.toString(i.isFertig()));
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
	
	// Status invertieren für Todo-Item per Item-Referenz
	public void setzeStatus(ToDoItem todo)
	{
		int idx = this.Items.indexOf(todo);
		boolean aktuellerWert = todo.isFertig();
		todo.setFertig(!aktuellerWert);
		this.Items.set(idx, todo);
	}
	
	// Status invertieren für Todo-Item per Listen-Index
	public void setzeStatus(int idx)
	{
		ToDoItem todo = this.Items.get(idx);
		boolean aktuellerWert = todo.isFertig();
		todo.setFertig(!aktuellerWert);
		this.Items.set(idx, todo);
	}
	
	// Getter & Setter
	
	public ArrayList<ToDoItem> getItems() {
		return Items;
	}

	public void setItems(ArrayList<ToDoItem> items) {
		Items = items;
	}
		
}
