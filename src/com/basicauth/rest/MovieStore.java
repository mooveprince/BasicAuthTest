package com.basicauth.rest;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.basicauth.pojo.Rental;

@Path("/moviestore")
public class MovieStore {

	
	  @GET
	  @Path("/rentals")
	  @Produces(MediaType.APPLICATION_JSON)
	  public ArrayList<Rental> getRentalInfo ( ) {
		  System.out.println("Getting Movie details");
		  ArrayList<Rental> rentalArray = new ArrayList<Rental>();
		  
		  Rental rental1  = new Rental ( );
		  rental1.setMovieName("Pulp Fiction");
		  rental1.setRentPerDay("$1");
		  rental1.setGenere("Action");
		  rental1.setImdbRating("9");
		  
		  Rental rental2  = new Rental ( );
		  rental2.setMovieName("Avengers");
		  rental2.setRentPerDay("$5");
		  rental2.setGenere("Action");
		  rental2.setImdbRating("8");		  
		  
		  rentalArray.add(rental1);
		  rentalArray.add(rental2);
		  
		  return rentalArray;
		  
	  }
}
