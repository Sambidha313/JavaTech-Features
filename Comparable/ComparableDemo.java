package co.java.Comparable;

class Movie implements Comparable<Movie> {
	public Movie(String name, int rating, int year) {
		super();
		this.rating = rating;
		this.name = name;
		this.year = year;
	}

	private int rating;
	private String name;
	private int year;

	public double getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	// Used to sort movies by year
	public int compareTo(Movie m) {
		return this.year - m.year;
	}

}