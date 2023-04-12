package book;

public class book {

	String name;
	int id;
	int year;
	int month;
	int day;
	
	String date=day+"-"+month+"-"+year;
	
	public book(String name, int id, int year, int month, int day) {
		super();
		this.name = name;
		this.id = id;
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public String toString() {
		return this.name+" "+this.id+" "+this.day+"-"+this.month+"-"+this.year;
	}
}
