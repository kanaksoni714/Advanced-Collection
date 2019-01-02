package Details.Movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MovieDetailsList {

	public static final int SortByName = 0;
	public static final int SortByLeadActor = 1;
	public static final int SortByLeadActress = 2;

	private ArrayList<MovieDetails> movieDetailsArrayList;
	public Object getMovieGenre;

	public ArrayList<MovieDetails> getMovieDetailsArrayList() {
		return movieDetailsArrayList;
	}

	public MovieDetailsList() {
		movieDetailsArrayList = new ArrayList<MovieDetails>();
	}

	public void removeMovie(String movieName) {
		for (int movie = 0; movie < movieDetailsArrayList.size(); movie++) {
			MovieDetails model = movieDetailsArrayList.get(movie);
			if (model.getMovName().equals(movieName)) {
				movieDetailsArrayList.remove(movie);
			}
		}

	}

	public void removeAllMovies(String movieName) {
		movieDetailsArrayList.clear();

	}

	public MovieDetails findMovieByMovieName(String movieName) {
		for (int movie = 0; movie < movieDetailsArrayList.size(); movie++) {
			MovieDetails model = movieDetailsArrayList.get(movie);
			if (model.getMovName().equals(movieName)) {
				return movieDetailsArrayList.get(movie);
			}
		}

		return null;

	}

	public void addMovie(String movieName, String leadActor,
			String leadActress, String genere) {
		movieDetailsArrayList.add(new MovieDetails(movieName, leadActor,
				leadActress, genere));
	}

	public MovieDetails FindMovieByGenre(String movieName) {

		for (int movie = 0; movie < movieDetailsArrayList.size(); movie++) {
			MovieDetails model = movieDetailsArrayList.get(movie);
			if (model.getMovieGenre().equals(getMovieGenre)) {
				return movieDetailsArrayList.get(movie);
			}
		}
		return null;
	}

	public ArrayList<MovieDetails> sort(int sortMethod) {
		switch (sortMethod) {
		case SortByName:
			Collections.sort(movieDetailsArrayList,
					new Comparator<MovieDetails>() {

						@Override
						public int compare(MovieDetails m1, MovieDetails m2) {
							return m1.getMovName().compareTo(m2.getMovName());
						}
					});
			return movieDetailsArrayList;
		case SortByLeadActor:
			Collections.sort(movieDetailsArrayList,
					new Comparator<MovieDetails>() {

						@Override
						public int compare(MovieDetails m1, MovieDetails m2) {
							return m1.getLeadActor().compareTo(
									m2.getLeadActor());
						}
					});
			return movieDetailsArrayList;
		case SortByLeadActress:
			Collections.sort(movieDetailsArrayList,
					new Comparator<MovieDetails>() {

						@Override
						public int compare(MovieDetails m1, MovieDetails m2) {
							return m1.getLeadActress().compareTo(
									m2.getLeadActress());
						}
					});
			return movieDetailsArrayList;

		default:
			return movieDetailsArrayList;
		}

	}

}
