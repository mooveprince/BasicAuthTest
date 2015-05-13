package com.basicauth.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.basicauth.pojo.Person;

@Path("/basicAuth")
public class BasicAuthTest {

	  @GET
	  @Path("/hello")
	  @Produces(MediaType.TEXT_PLAIN)
	  public String sayPlainTextHello() {
		  System.out.println("Inside REST service");
	    return "Hello Jersey";
	  }
	  
	  @GET
	  @Path("/details")
	  @Produces(MediaType.APPLICATION_JSON)
	  public Person getMyDetails ( ) {
		  System.out.println("get My details");
		  Person person = new Person ( );
		  person.setName("Moove");
		  person.setAge(12);
		  person.setHobby("Coding");
		  return person;
	  }
	  
}
