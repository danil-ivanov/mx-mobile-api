package com.magenta.maxoptra.api.mobile.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("mobile")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)
public interface MobileIntegrationAPI {

    @POST
    @Path("/sync")
    void sync(@Context HttpServletRequest request, @Context HttpServletResponse response);

}

