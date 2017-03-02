package com.example;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MovieRecommender {
	private Logger log = Logger.getLogger(MovieRecommender.class);

	private final CustomerPreferenceDao customerPreferenceDao;

	/**
	 * Constructor based injection
	 * 
	 * @param customerPreferenceDao
	 */
	@Autowired
	public MovieRecommender(CustomerPreferenceDao customerPreferenceDao) {
		this.customerPreferenceDao = customerPreferenceDao;
	}

	/**
	 * injection to fields
	 */
	@Autowired
	private MovieCatalog movieCatalog;

	/**
	 * beans of all type can be injected to the Array of movies
	 */
	@Autowired
	private MovieCatalog[] movieCatalogs1;

	public int getMovie() {

		return movieCatalogs1.length;

	}

	@Autowired
	private Set<MovieCatalog> movieCatalogs;

	public int getMovieSet() {

		return movieCatalogs.size();
	}

	@Autowired
	private List<MovieCatalog> movieCatalogsList;

	public int getMovieList() {
		for (Iterator iterator = movieCatalogsList.iterator(); iterator.hasNext();) {
			MovieCatalog movieCatalog = (MovieCatalog) iterator.next();
			log.info(movieCatalog.getname());
			
		}
		return movieCatalogsList.size();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((movieCatalogsList == null) ? 0 : movieCatalogsList.hashCode());
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
		MovieRecommender other = (MovieRecommender) obj;
		if (movieCatalogsList == null) {
			if (other.movieCatalogsList != null)
				return false;
		} else if (!movieCatalogsList.equals(other.movieCatalogsList))
			return false;
		return true;
	}

}
