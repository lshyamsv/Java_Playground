package ds.array;

public class DVDcollection {

	// Instance variables
	private String name;
	private int year;
	private String director;

	DVDcollection[] dvdcollection = new DVDcollection[15];

	public DVDcollection(String name, int year, String director) {
		this.name = name;
		this.year = year;
		this.director = director;

	}

	public String toString() {

		String dvd = this.name + ", Directed By " + this.director
				+ ", released in " + this.year;
		System.out.println(dvd);
		return dvd;

	}

	public static void main(String[] args) {

		DVDcollection avengers = new DVDcollection("Avengers", 2012, "Random");
		avengers.dvdcollection[0] = avengers;
		avengers.toString();

	}
}
