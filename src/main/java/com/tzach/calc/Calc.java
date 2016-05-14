package com.tzach.calc;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/calc")
public class Calc {

	@POST
	public Response operation(@FormParam("operation") int operation, @FormParam("num1") int num1,
			@FormParam("num2") int num2) {
		switch (operation) {
		case 1:
			int sum = num1 + num2;
			return Response.status(200).entity(sum).build();
			
		case 2:
			int sub = num1 - num2;
			return Response.status(200).entity(sub).build();

		default:
			return Response.status(300).entity("Unknown operation").build();
		}

	}
}
