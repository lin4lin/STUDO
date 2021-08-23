package Klassen;

// Java Library Imports
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.text.SimpleDateFormat;

// Package Imports
import Klassen.Studentenansicht.*;
import Klassen.Betreueransicht.*;

public class Menu {
	
	//TODO Speichern und Laden in bzw. aus Datei implementieren.
	
	// "Globale" Variablen - Studentenansicht
	public static Kalender studKalender = new Kalender();
	public static PTBBoard ptbBoard = new PTBBoard();
	public static ToDoListe todoListe = new ToDoListe();
	
	// "Globale" Variablen - Betreueransicht
	public static Aufgabenboard aufgabenBoard = new Aufgabenboard();
	public static Bewertungsuebersicht betreuerBewertungUebersicht = new Bewertungsuebersicht();
	
	// "Globale" Variablen - Ausbilderansicht
	public static Kalender praxisKalender = new Kalender();
	public static Bewertungsuebersicht ausbilderBewertungUebersicht = new Bewertungsuebersicht();
	
	public static void main(String[] args)	{
		
		// Programm starten
		startProgram();
	}
	
	public static void startProgram() {
		
		// Menu-Optionen festlegen für Eingabevalidierung
		ArrayList<Integer> menuOptions = new ArrayList<Integer>(
			Arrays.asList(0, 1, 2, 3)	
		);
		
		// Menu-Ausgabe
		printMainMenu();
		
		// Nutzereingabe für Menu-Option
		int auswahl = chooseNumber();
		
		// Überprüfung Nutzereingabe
		if (menuOptions.contains(auswahl)) {
			if (auswahl == 0)
			{
				System.exit(0);
			}
			else if(auswahl == 1)
			{
				showStudentenAnsicht();
			}
			else if(auswahl == 2)
			{
				showBetreuerAnsicht();
			}
			else if(auswahl == 3)
			{
				showAusbilderAnsicht();
			}
		} 
		// Neuausgabe des Menu bei unerwarteter Eingabe
		else {
			cls();
			printMainMenu();
		}
	}
	
	// Menu ausgeben
	static void printMainMenu() {
		System.out.println("> Wilkommen bei STUDO!");
		System.out.println("------------------------");
		System.out.println("(1) - Studentenansicht");
		System.out.println("(2) - Betreueransicht");
		System.out.println("(3) - Ausbilderansicht");
		System.out.println("(0) - Programm beenden");
		System.out.println();
	}
	
	// Studentenview zeigen
	static void showStudentenAnsicht() {
		cls();
		printStudMenu();
		
		ArrayList<Integer> studMenuOptions = new ArrayList<Integer>(
				Arrays.asList(0, 1, 2, 3)	
			);
		
		//Menu-Auswahl
		int studAuswahl = chooseNumber();
				
		// Überprüfung Nutzereingabe
		if (studMenuOptions.contains(studAuswahl)) {
			if (studAuswahl == 0) {
				cls();
				startProgram();
			}
			else if(studAuswahl == 1) {
				// Kalendereinträge einzeln anzeigen
				while (true) {
					cls();
					System.out.println("Studentenansicht > Kalender");
					System.out.println("----------------------------");
					studKalender.anzeigen();
					System.out.println("(1) - Hinzufügen");
					System.out.println("(2) - Löschen");
					System.out.println("(0) - Zurück zur Studentenansicht");
					
					int studKalenderAuswahl = chooseNumber();
					if (Arrays.asList(0,1,2).contains(studKalenderAuswahl)) {
						if (studKalenderAuswahl == 0) {
							break;
						}
						else if (studKalenderAuswahl == 1) {
							cls();
							//Kalendereintrag hinzufügen
							System.out.println("Studentenansicht > Kalender");
							System.out.println("----------------------------");
							System.out.println("HINZUFÜGEN------------------");
							System.out.println("----------------------------");
							System.out.println("Titel: ");
							String bezeichnung = enterString();
							Date datum = enterDate();
							System.out.println("Beschreibung: ");
							String beschreibung = enterString();
							Termin t = new Termin(datum,bezeichnung,beschreibung);
							studKalender.hinzufuegen(t);
							continue;
						}
						else if (studKalenderAuswahl == 2) {
							cls();
							// Kalendereintrag loeschen
							System.out.println("Studentenansicht > Kalender");
							System.out.println("----------------------------");
							System.out.println("LÖSCHEN---------------------");
							System.out.println("----------------------------");
							System.out.println("Bitte den Index des zu löschenden Eintrags eingeben: ");
							int idx = enterInt();
							studKalender.loeschen(idx);
							continue;
						}
						else {
							continue;
						}
					}
				}
				showStudentenAnsicht();	
			}
			else if(studAuswahl == 2) {
				while (true) {
					cls();
					// Hauptmenu anzeigen
					System.out.println("Studentenansicht > PTB-Board");
					System.out.println("----------------------------");
					ptbBoard.anzeigen();
					System.out.println("(1) - Hinzufügen");
					System.out.println("(2) - Löschen");
					System.out.println("(0) - Zurück zur Studentenansicht");
					
					int ptbBoardAuswahl = chooseNumber();
					if (Arrays.asList(0,1,2).contains(ptbBoardAuswahl)) {
						if (ptbBoardAuswahl == 0) {
							break;
						}
						else if (ptbBoardAuswahl == 1) {
							cls();
							//PTB Eintrag hinzufügen
							System.out.println("Studentenansicht > PTB-Board");
							System.out.println("----------------------------");
							System.out.println("HINZUFÜGEN------------------");
							System.out.println("----------------------------");
							System.out.println("Thema: ");
							String thema = enterString();
							Date datum = enterDate();
							System.out.println("Semester: ");
							int semester = enterInt();
							PTBItem i = new PTBItem(thema,semester,datum);
							ptbBoard.hinzufuegen(i);
							continue;
						}
						else if (ptbBoardAuswahl == 2) {
							cls();
							// PTB Eintrag loeschen
							System.out.println("Studentenansicht > PTB-Board");
							System.out.println("----------------------------");
							System.out.println("LÖSCHEN---------------------");
							System.out.println("----------------------------");
							System.out.println("Bitte den Index des zu löschenden Eintrags eingeben: ");
							int idx = enterInt();
							ptbBoard.loeschen(idx);
							continue;
						}
						else {
							continue;
						}
					}
				}
				showStudentenAnsicht();
			}
			else if(studAuswahl == 3) {
				while (true) {
					cls();
					// Hautpmenu anzeigen
					System.out.println("Studentenansicht > ToDo-Liste");
					System.out.println("-----------------------------");
					todoListe.anzeigen();
					System.out.println("(1) - Hinzufügen");
					System.out.println("(2) - Status ändern");
					System.out.println("(3) - Löschen");
					System.out.println("(0) - Zurück zur Studentenansicht");
					
					int todoAuswahl = chooseNumber();
					if (Arrays.asList(0,1,2,3).contains(todoAuswahl)) {
						if (todoAuswahl == 0) {
							break;
						}
						else if (todoAuswahl == 1) {
							cls();
							// To-Do hinzufügen
							System.out.println("Studentenansicht > ToDo-Liste");
							System.out.println("-----------------------------");
							System.out.println("HINZUFÜGEN-------------------");
							System.out.println("-----------------------------");
							System.out.println("Beschreibung: ");
							String beschreibung = enterString();
							System.out.println("Ist erledigt? [0 - nein, 1 - ja]: ");
							boolean status = enterBool();
							ToDoItem t = new ToDoItem(beschreibung,status);
							todoListe.hinzufuegen(t);
							continue;
						}
						else if (todoAuswahl == 2) {
							cls();
							// To-Do Status aendern
							System.out.println("Studentenansicht > ToDo-Liste");
							System.out.println("-----------------------------");
							System.out.println("ÄNDERN-----------------------");
							System.out.println("-----------------------------");
							System.out.println("Bitte den Index des zu ändernden Eintrags eingeben: ");
							int idx = enterInt();
							todoListe.setzeStatus(idx);
							continue;
						}
						else if (todoAuswahl == 3) {
							cls();
							// To-Do-Eintrag loeschen
							System.out.println("Studentenansicht > ToDo-Liste");
							System.out.println("-----------------------------");
							System.out.println("LÖSCHEN----------------------");
							System.out.println("-----------------------------");
							System.out.println("Bitte den Index des zu löschenden Eintrags eingeben: ");
							int idx = enterInt();
							todoListe.loeschen(idx);
							continue;
						}
						else {
							continue;
						}
					}
				}
				// Menu anzeigen
				showStudentenAnsicht();
			}
		} 
		// Neuausgabe des Menu bei unerwarteter Eingabe
		else {
			cls();
			printStudMenu();
		}
	}

	static void printStudMenu() {
		System.out.println("> Studentenansicht");
		System.out.println("---------------------------");
		System.out.println("(1) - Kalender");
		System.out.println("(2) - PTB-Board");
		System.out.println("(3) - To-Do-Liste");
		System.out.println("(0) - Zurück zum Hauptmenu");
		System.out.println();
	}
	
	static void showBetreuerAnsicht() {
		cls();
		printBetrMenu();
		
		ArrayList<Integer> betrMenuOptions = new ArrayList<Integer>(
				Arrays.asList(0, 1, 2)	
			);
		
		//Menu-Auswahl
		int betrAuswahl = chooseNumber();
				
		// Überprüfung Nutzereingabe
		if (betrMenuOptions.contains(betrAuswahl)) {
			if (betrAuswahl == 0) {
				cls();
				startProgram();
			}
			else if(betrAuswahl == 1) {
				while (true) {
					cls();
					// Hauptmenu anzeigen
					System.out.println("Betreueransicht > Aufgabenboard");
					System.out.println("-------------------------------");
					aufgabenBoard.anzeigen();
					System.out.println("(1) - Hinzufügen");
					System.out.println("(2) - Löschen");
					System.out.println("(0) - Zurück zur Betreueransicht");
					int aufgabenAuswahl = chooseNumber();
					if (Arrays.asList(0,1,2).contains(aufgabenAuswahl)) {
						if (aufgabenAuswahl == 0) {
							break;
						}
						else if (aufgabenAuswahl == 1) {
							cls();
							// Aufgabenelement hinzufuegen
							System.out.println("Betreueransicht > Aufgabenboard");
							System.out.println("-------------------------------");
							System.out.println("HINZUFÜGEN---------------------");
							System.out.println("-------------------------------");
							System.out.println("Bezeichnung: ");
							String bezeichnung = enterString();
							System.out.println("Student: ");
							String student = enterString();
							Date datum = enterDate();
							System.out.println("Beschreibung: ");
							String beschreibung = enterString();
							Aufgabe a = new Aufgabe(datum, student, bezeichnung, beschreibung);
							aufgabenBoard.hinzufuegen(a);
							continue;
						}
						else if (aufgabenAuswahl == 2) {
							cls();
							// Aufgabenelement loeschen
							System.out.println("Betreueransicht > Aufgabenboard");
							System.out.println("-------------------------------");
							System.out.println("LÖSCHEN------------------------");
							System.out.println("-------------------------------");
							System.out.println("Bitte den Index des zu löschenden Eintrags eingeben: ");
							int idx = enterInt();
							aufgabenBoard.loeschen(idx);
							continue;
						}
						else {
							continue;
						}
					} 
				}
				// Menu anzeigen
				showBetreuerAnsicht();
			}
			else if(betrAuswahl == 2) {
				while (true) {
					cls();
					System.out.println("Betreueransicht > Bewertungsuebersicht");
					System.out.println("--------------------------------------");
					betreuerBewertungUebersicht.anzeigen();
					System.out.println("(1) - Hinzufügen");
					System.out.println("(2) - Löschen");
					System.out.println("(0) - Zurück zur Betreueransicht");
					int bewertungenAuswahl = chooseNumber();
					if (Arrays.asList(0,1,2).contains(bewertungenAuswahl)) {
						if (bewertungenAuswahl == 0) {
							break;
						}
						else if (bewertungenAuswahl == 1) {
							cls();
							System.out.println("Betreueransicht > Bewertungsuebersicht");
							System.out.println("--------------------------------------");
							System.out.println("HINZUFÜGEN----------------------------");
							System.out.println("--------------------------------------");
							System.out.println("Student: ");
							String student = enterString();
							Date datum = enterDate();
							System.out.println("Bewertung: ");
							String bewertung = enterString();
							Bewertungsbogen b = new Bewertungsbogen(student, datum, bewertung);
							betreuerBewertungUebersicht.hinzufuegen(b);
							continue;
						}
						else if (bewertungenAuswahl == 2) {
							cls();
							System.out.println("Betreueransicht > Bewertungsuebersicht");
							System.out.println("--------------------------------------");
							System.out.println("LÖSCHEN-------------------------------");
							System.out.println("--------------------------------------");
							System.out.println("Bitte den Index des zu löschenden Eintrags eingeben: ");
							int idx = enterInt();
							betreuerBewertungUebersicht.loeschen(idx);
							continue;
						}
						else {
							continue;
						}
					} 
				}
				showBetreuerAnsicht();
			}
		} 
		// Neuausgabe des Menu bei unerwarteter Eingabe
		else {
			cls();
			printBetrMenu();
		}
	}
	
	static void printBetrMenu() {
		System.out.println("> Betreueransicht");
		System.out.println("---------------------------");
		System.out.println("(1) - Aufgaben-Board");
		System.out.println("(2) - Bewertungen");
		System.out.println("(0) - Zurück zum Hauptmenu");
		System.out.println();
	}
	
	static void showAusbilderAnsicht() {
		cls();
		printAusbMenu();
		
		ArrayList<Integer> ausbMenuOptions = new ArrayList<Integer>(
				Arrays.asList(0, 1, 2)	
			);
		
		//Menu-Auswahl
		int ausbAuswahl = chooseNumber();
				
		// Überprüfung Nutzereingabe
		if (ausbMenuOptions.contains(ausbAuswahl)) {
			if (ausbAuswahl == 0) {
				cls();
				startProgram();
			}
			else if(ausbAuswahl == 1) {
				while (true) {
					cls();
					// Menu anzeigen
					System.out.println("Ausbilderansicht > Kalender");
					System.out.println("---------------------------");
					praxisKalender.anzeigen();
					System.out.println("(1) - Hinzufügen");
					System.out.println("(2) - Löschen");
					System.out.println("(0) - Zurück zur Studentenansicht");
					
					int praxKalenderAuswahl = chooseNumber();
					if (Arrays.asList(0,1,2).contains(praxKalenderAuswahl)) {
						if (praxKalenderAuswahl == 0) {
							break;
						}
						else if (praxKalenderAuswahl == 1) {
							cls();
							//Kalendereintrag hinzufügen
							System.out.println("Ausbilderansicht > Kalender");
							System.out.println("---------------------------");
							System.out.println("HINZUFÜGEN-----------------");
							System.out.println("---------------------------");
							System.out.println("Titel: ");
							String bezeichnung = enterString();
							Date datum = enterDate();
							System.out.println("Beschreibung: ");
							String beschreibung = enterString();
							Termin t = new Termin(datum,bezeichnung,beschreibung);
							praxisKalender.hinzufuegen(t);
							continue;
						}
						else if (praxKalenderAuswahl == 2) {
							cls();
							// Kalendereintrag loeschen
							System.out.println("Ausbilderansicht > Kalender");
							System.out.println("---------------------------");
							System.out.println("LÖSCHEN--------------------");
							System.out.println("---------------------------");
							System.out.println("Bitte den Index des zu löschenden Eintrags eingeben: ");
							int idx = enterInt();
							praxisKalender.loeschen(idx);
							continue;
						}
						else {
							continue;
						}
					}
				}
				showAusbilderAnsicht();	
			}
			else if(ausbAuswahl == 2) {
				while (true) {
					cls();
					// Menu anzeigen
					System.out.println("Ausbilderansicht > Bewertungsuebersicht");
					System.out.println("---------------------------------------");
					betreuerBewertungUebersicht.anzeigen();
					System.out.println("(1) - Hinzufügen");
					System.out.println("(2) - Löschen");
					System.out.println("(0) - Zurück zur Betreueransicht");
					int ausbBewertungenAuswahl = chooseNumber();
					if (Arrays.asList(0,1,2).contains(ausbBewertungenAuswahl)) {
						if (ausbBewertungenAuswahl == 0) {
							break;
						}
						else if (ausbBewertungenAuswahl == 1) {
							cls();
							// Bewertung hinzufuegen
							System.out.println("Ausbilderansicht > Bewertungsuebersicht");
							System.out.println("---------------------------------------");
							System.out.println("HINZUFÜGEN-----------------------------");
							System.out.println("---------------------------------------");
							System.out.println("Student: ");
							String student = enterString();
							Date datum = enterDate();
							System.out.println("Bewertung: ");
							String bewertung = enterString();
							Bewertungsbogen b = new Bewertungsbogen(student, datum, bewertung);
							ausbilderBewertungUebersicht.hinzufuegen(b);
							continue;
						}
						else if (ausbBewertungenAuswahl == 2) {
							cls();
							// Bewertung loeschen
							System.out.println("Ausbilderansicht > Bewertungsuebersicht");
							System.out.println("---------------------------------------");
							System.out.println("LÖSCHEN--------------------------------");
							System.out.println("---------------------------------------");
							System.out.println("Bitte den Index des zu löschenden Eintrags eingeben: ");
							int idx = enterInt();
							ausbilderBewertungUebersicht.loeschen(idx);
							continue;
						}
						else {
							continue;
						}
					} 
				}
				showAusbilderAnsicht();
			}
		} 
		// Neuausgabe des Menu bei unerwarteter Eingabe
		else {
			cls();
			printBetrMenu();
		}
	}
	
	static void printAusbMenu() {
		System.out.println("> Ausbilderansicht");
		System.out.println("---------------------------");
		System.out.println("(1) - Praxisphasenkalender");
		System.out.println("(2) - Praxisphasenbewertung");
		System.out.println("(0) - Zurück zum Hauptmenu");
		System.out.println();
	}
	
	// Bildschirm leeren
	static void cls() {
		for(int i =  0 ; i!= 50; i++) {
			System.out.println("");
		}
	}
	
	// Konsole auslesen und eingegebene Nummer zurueckgeben
	static int chooseNumber() {
		
		System.out.println("Nummer fuer gewuenschte Option eingeben und mit [Enter] bestaetigen.");
		
		//Input-Reader initialisieren
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String Auswahl = "-1";
		
		//Nutzereingabe lesen und als int parsen
		// Try/Catch für unerwartete Eingaben
		try {
			Auswahl = reader.readLine();
			return Integer.parseInt(Auswahl);
		} 
		catch (Exception ex) {
			System.out.println("Fehler bei der Nutzereingabe.");
		}
		
		//Fehler
		return -1;
	}
	
	// Datumseingabe über Konsole
	@SuppressWarnings("deprecation")
	static Date enterDate() {
		
		System.out.println("Gewuenschtes Datum im Format [dd-MM-yyyy] eingeben: ");
		
		//Input-Reader initialisieren
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input;
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		// Nutzereingabe lesen und als int parsen
		// Try/Catch für unerwartete Eingaben
		try {
			input = reader.readLine();
			return dateFormat.parse(input);
		} 
		catch (Exception ex) {
			System.out.println("Fehler bei der Nutzereingabe.");
		}
		
		return new Date(1900,1,1);
		
	}
	
	// Stringeingabe über Konsole
	static String enterString() {
		
		//Input-Reader initialisieren
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		
		//Nutzereingabe lesen und als int parsen
		try {
			input = reader.readLine();
		} 
		catch (Exception ex) {
			System.out.println("Fehler bei der Nutzereingabe.");
		}
		
		// Fehler
		return input;
	}
	
	// Integer Eingabe über Konsole
	static int enterInt() {
		
		//Input-Reader initialisieren
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//Nutzereingabe lesen und als int parsen
		// Try/Catch für unerwartete Eingaben
		try {
			String Auswahl = reader.readLine();
			return Integer.parseInt(Auswahl);
		} 
		catch (Exception ex) {
			System.out.println("Fehler bei der Nutzereingabe.");
		}
		
		//Fehler
		return -1;
	}
	
	// Bool Eingabe über die Konsole
	static boolean enterBool() {
		
		//Input-Reader initialisieren
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//Nutzereingabe lesen und als int parsen
		// Try/Catch für unerwartete Eingaben
		try {
			String Auswahl = reader.readLine();
			int num = Integer.parseInt(Auswahl);
			if (num == 1) { 
				return true;
			} else {
				return false;
			}
		} 
		catch (Exception ex) {
			System.out.println("Fehler bei der Nutzereingabe.");
		}
		
		//Fehler
		return false;
	}
}
