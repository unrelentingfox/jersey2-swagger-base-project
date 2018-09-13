package com.jersey.swagger.base.ws.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class BaseResource {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getTestService() {
		return "Hello World! This is coming from webservice!!";
	}

	@GET
	@Path("test")
	@Produces(MediaType.TEXT_PLAIN)
	public String getTestPath() {
		return "this is the test path!";
	}
}