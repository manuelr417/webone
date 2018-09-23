package edu.uprm.cse.datastructures.p1.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/cars")
public class CarController {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getCars() {
		return "Bitch";
	}
}
