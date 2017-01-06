package com.redhat.hw;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


/**
 * A simple REST service which says hello at various endpoints using HelloService. Please take a look at the web.xml where JAX-RS
 * is enabled
 *
 */

@Path("/")
public class HelloWorld {
    @Inject
    private HelloService helloService;

    @GET
    @Path("/english")
    @Produces({ "text/html" })
    public String hello() {
        return helloService.createHelloMessage("Hi there!");
    }
    
    @GET
    @Path("/hindi")
    @Produces({ "text/html" })
    public String hindi() {
        return helloService.createHelloMessage("Namasthe!");
    }
    
    @GET
    @Path("/tamil")
    @Produces({ "text/html" })
    public String tamil() {
        return helloService.createHelloMessage("Vanakkam!"); 
    }
    
    @GET
    @Path("/french")
    @Produces({ "text/html" })
    public String french() {
        return helloService.createHelloMessage("Bonjour!"); 
    }
    
    @GET
    @Path("/spanish")
    @Produces({ "text/html" })
    public String spanish() {
        return helloService.createHelloMessage("Hola!"); 
    }

}
