/*
2)	Create class Movie_Details with field’s mov_Name, lead_actor, lead_actress, and genre  
 * add setter and getter method in that class. 
a.	After creating this class create class Movie_DetailsList class who will maintain all the objects.
b.	Movie_DetailsList class should have method add_movie(), remove_movie(), remove_AllMovies(), 
	find_movie_By_mov_Name(), find_movie_By_Genre()
c.	Movie_DetailsList should have method which will take an argument that will be use to determine on which to sort 

 */




package Details.Movie;

public class MovieDetails implements Comparable<MovieDetails>
{
	public String movieName;
	public String leadActor;
	public String leadActress;
	public String movieGenre;
	
	


	public MovieDetails(String movName, String movieGenre,String leadActress, String leadActor) {
		super();
		this.movieName = movName;
		this.leadActor = leadActor;
		this.leadActress = leadActress;
		this.movieGenre = movieGenre;
}




	/**
	 * @return the movName
	 */
	public String getMovName() {
		return movieName;
	}




	/**
	 * @param movName the movName to set
	 */
	public void setMovName(String movName) {
		this.movieName = movName;
	}




	/**
	 * @return the leadActor
	 */
	public String getLeadActor() {
		return leadActor;
	}




	/**
	 * @param leadActor the leadActor to set
	 */
	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}





	/**
	 * @return the leadActress
	 */
	public String getLeadActress() {
		return leadActress;
	}




	/**
	 * @param leadActress the leadActress to set
	 */
	public void setLeadActress(String leadActress) {
		this.leadActress = leadActress;
	}




	/**
	 * @return the movieGenre
	 */
	public String getMovieGenre() {
		return movieGenre;
	}




	/**
	 * @param movieGenre the movieGenre to set
	 */
	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}






	@Override
	public int compareTo(MovieDetails o) {
		// TODO Auto-generated method stub
		return 0;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((leadActor == null) ? 0 : leadActor.hashCode());
		result = prime * result
				+ ((leadActress == null) ? 0 : leadActress.hashCode());
		result = prime * result
				+ ((movieGenre == null) ? 0 : movieGenre.hashCode());
		result = prime * result
				+ ((movieName == null) ? 0 : movieName.hashCode());
		return result;
	}




	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieDetails other = (MovieDetails) obj;
		if (leadActor == null) {
			if (other.leadActor != null)
				return false;
		} else if (!leadActor.equals(other.leadActor))
			return false;
		if (leadActress == null) {
			if (other.leadActress != null)
				return false;
		} else if (!leadActress.equals(other.leadActress))
			return false;
		if (movieGenre == null) {
			if (other.movieGenre != null)
				return false;
		} else if (!movieGenre.equals(other.movieGenre))
			return false;
		if (movieName == null) {
			if (other.movieName != null)
				return false;
		} else if (!movieName.equals(other.movieName))
			return false;
		return true;
	}

}
