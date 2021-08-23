package Klassen.Studentenansicht;

public class ToDoItem {
	
	private boolean fertig;
	private String beschreibung;
	
	// Konstruktor
	public ToDoItem(String beschreibung, boolean fertig) {
		this.fertig = fertig;
		this.beschreibung = beschreibung;
	}
	
	// Getter & Setter
	
	public boolean isFertig() {
		return fertig;
	}
	public void setFertig(boolean fertig) {
		this.fertig = fertig;
	}
	public String getBeschreibung() {
		return beschreibung;
	}
	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
	
}
