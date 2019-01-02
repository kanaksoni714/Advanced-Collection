package Details.Movie;

import static org.junit.Assert.*;


import org.junit.Test;

public class MovieDeialsTest {

	@Test
	public void testAddMovieName() {
		MovieDetailsList movieDetailsList = new MovieDetailsList();
		movieDetailsList.addMovie("Inception", "Leonardo Di caprio", "Ellen","Psychic");
		movieDetailsList.addMovie("Titanic", "Kate", "Moss","Romantic");
		movieDetailsList.addMovie("Simbha", "Chris ", "Sara","Action");
		String expected="[MovieDetails [movieName=Inception, leadActor=Leonardo Di caprio, leadActress=Ellen], MovieDetails [movieName=Titanic, leadActor=Kate, leadActress=Moss], MovieDetails [movieName=Simbha, leadActor=Chris , leadActress=Sara]]";
		assertEquals(expected, movieDetailsList.getMovieDetailsArrayList().toString());
		
	}


	@Test
	public void testRemoveMovieName() {
		MovieDetailsList movieDetailsList = new MovieDetailsList();
		movieDetailsList.addMovie("Inception", "Leonardo Di caprio", "Ellen","Psychic");
		movieDetailsList.addMovie("Titanic", "Kate", "Moss","Romantic");
		movieDetailsList.addMovie("Simbha", "Chris ", "Sara","Action");
		String expected="[MovieDetails [movieName=Inception, leadActor=Leonardo Di caprio, leadActress=Ellen], MovieDetails [movieName=Titanic, leadActor=Kate, leadActress=Moss]]";
		
		movieDetailsList.removeMovie("Simbha");

		assertEquals(expected,movieDetailsList.getMovieDetailsArrayList().toString());
		
	}


	@Test
	public void testRemoveAllMovie() {
		MovieDetailsList movieDetailsList = new MovieDetailsList();
		movieDetailsList.addMovie("Inception", "Leonardo Di caprio", "Ellen","Psychic");
		movieDetailsList.addMovie("Titanic", "Kate", "Moss","Romantic");
		movieDetailsList.addMovie("Simbha", "Chris ", "Sara","Action");
		String expected="[]";
		
		movieDetailsList.removeAllMovies(null);

		assertEquals(expected,movieDetailsList.getMovieDetailsArrayList().toString());
		
	}


	@Test
	public void testFindMovieByGenre() {
		MovieDetailsList movieDetailsList = new MovieDetailsList();
		movieDetailsList.addMovie("Inception", "Leonardo Di caprio", "Ellen","Psychic");
		movieDetailsList.addMovie("Titanic", "Kate", "Moss","Romantic");
		movieDetailsList.addMovie("Simbha", "Chris ", "Sara","Action");
		String expected="MovieDetails [movieName=Titanic, leadActor=Kate, leadActress=Moss]";
				
		assertEquals(expected,movieDetailsList.FindMovieByGenre("Psychic").toString());
		
	}



	@Test
	public void testFindMovieByMovieName() {
		MovieDetailsList movieDetailsList = new MovieDetailsList();
		movieDetailsList.addMovie("Inception", "Leonardo Di caprio", "Ellen","Psychic");
		movieDetailsList.addMovie("Titanic", "Kate", "Moss","Romantic");
		movieDetailsList.addMovie("Simbha", "Chris ", "Sara","Action");

		String expected="MovieDetails [movieName=Simbha, leadActor=Chris , leadActress=Sara]";
		assertEquals(expected,movieDetailsList.findMovieByMovieName("Simbha").toString());
		
	}

	
	
	@Test
	public void testSortByMovieName() {
		MovieDetailsList movieDetailsList = new MovieDetailsList();
		movieDetailsList.addMovie("Inception", "Leonardo Di caprio", "Ellen","Psychic");
		movieDetailsList.addMovie("Titanic", "Kate", "Moss","Romantic");
		movieDetailsList.addMovie("Simbha", "Chris ", "Sara","Action");
			
		String expected="[MovieDetails [movieName=Simbha, leadActor=Chris , leadActress=Sara], MovieDetails [movieName=Titanic, leadActor=Kate, leadActress=Moss], MovieDetails [movieName=Inception, leadActor=Leonardo Di caprio, leadActress=Ellen]]";
		assertEquals(expected, movieDetailsList.sort(MovieDetailsList.SortByName).toString());
	}
	

	@Test
	public void testSortByMovieLeadActor() {
		MovieDetailsList movieDetailsList = new MovieDetailsList();
		movieDetailsList.addMovie("Inception", "Leonardo Di caprio", "Ellen","Psychic");
		movieDetailsList.addMovie("Titanic", "Kate", "Moss","Romantic");
		movieDetailsList.addMovie("Simbha", "Chris ", "Sara","Action");
			
		String expected="[MovieDetails [movieName=Simbha, leadActor=Chris , leadActress=Sara], MovieDetails [movieName=Titanic, leadActor=Kate, leadActress=Moss], MovieDetails [movieName=Inception, leadActor=Leonardo Di caprio, leadActress=Ellen]]";
		assertEquals(expected, movieDetailsList.sort(MovieDetailsList.SortByLeadActor).toString());
	}
	

	@Test
	public void testSortByMovieLeadActress() {
		MovieDetailsList movieDetailsList = new MovieDetailsList();
		movieDetailsList.addMovie("Inception", "Leonardo Di caprio", "Ellen","Psychic");
		movieDetailsList.addMovie("Titanic", "Kate", "Moss","Romantic");
		movieDetailsList.addMovie("Simbha", "Chris ", "Sara","Action");
			
		String expected="[MovieDetails [movieName=Inception, leadActor=Leonardo Di caprio, leadActress=Ellen], MovieDetails [movieName=Simbha, leadActor=Chris , leadActress=Sara], MovieDetails [movieName=Titanic, leadActor=Kate, leadActress=Moss]]";
		assertEquals(expected, movieDetailsList.sort(MovieDetailsList.SortByLeadActress).toString());
	}
}