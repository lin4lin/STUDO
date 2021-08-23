package Klassen.Ausbilderansicht;

public class Bewertung {
	private String student;
	private String kriterien;
	private String bewertung;
	/**
	 * @param student
	 * @param kriterien
	 * @param bewertung
	 */
	public Bewertung(String student, String kriterien, String bewertung) {
		super();
		this.student = student;
		this.kriterien = kriterien;
		this.bewertung = bewertung;
	}
	/**
	 * 
	 */
	public Bewertung() {
		super();
	}
	/**
	 * @return the student
	 */
	public String getStudent() {
		return student;
	}
	/**
	 * @param student the student to set
	 */
	public void setStudent(String student) {
		this.student = student;
	}
	/**
	 * @return the kriterien
	 */
	public String getKriterien() {
		return kriterien;
	}
	/**
	 * @param kriterien the kriterien to set
	 */
	public void setKriterien(String kriterien) {
		this.kriterien = kriterien;
	}
	/**
	 * @return the bewertung
	 */
	public String getBewertung() {
		return bewertung;
	}
	/**
	 * @param bewertung the bewertung to set
	 */
	public void setBewertung(String bewertung) {
		this.bewertung = bewertung;
	}
	
}
