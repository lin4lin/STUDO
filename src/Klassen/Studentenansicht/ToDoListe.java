package Klassen.Studentenansicht;

import java.util.ArrayList;

public class ToDoListe {

	public ArrayList<ToDoItem> Items;
	
	public ToDoListe() {
		this.Items = new ArrayList<ToDoItem>();
	}
	
	public void hinzufuegen(ToDoItem todo)
	{
		this.Items.add(todo);	
	}
	
	public void loeschen(ToDoItem todo)
	{
		this.Items.remove(todo);
	}
	
	public void loeschen(int idx)
	{
		this.Items.remove(idx);
	}
	
	public void bearbeiten(ToDoItem todo)
	{
		int idx = this.Items.indexOf(todo);
		this.Items.set(idx, todo);
	}
	
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
	
	public void setzeStatus(ToDoItem todo)
	{
		int idx = this.Items.indexOf(todo);
		boolean aktuellerWert = todo.isFertig();
		todo.setFertig(!aktuellerWert);
		this.Items.set(idx, todo);
	}
	
	public void setzeStatus(int idx)
	{
		ToDoItem todo = this.Items.get(idx);
		boolean aktuellerWert = todo.isFertig();
		todo.setFertig(!aktuellerWert);
		this.Items.set(idx, todo);
	}
}
