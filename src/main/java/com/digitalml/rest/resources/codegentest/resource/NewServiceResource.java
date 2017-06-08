package com.digitalml.rest.resources.codegentest.resource;
        	
import java.lang.IllegalArgumentException;
import java.security.AccessControlException;

import javax.servlet.http.HttpServletRequest;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import io.dropwizard.jersey.PATCH;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.lang.Object;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
	
// Customer specific imports

// Service specific imports
import com.digitalml.rest.resources.codegentest.service.NewServiceService;
	
import com.digitalml.rest.resources.codegentest.service.NewServiceService.NewOperation1ReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.NewServiceService.NewOperation1ReturnDTO;
import com.digitalml.rest.resources.codegentest.service.NewServiceService.NewOperation1InputParametersDTO;
	
import com.digitalml.rest.resources.codegentest.*;
	
	/**
	 * Service: New Service
	 * 120
	 *
	 * @author admin
	 * @version 1
	 *
	 */
	

	@Path("/")
	@Produces({ MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON })
	public class NewServiceResource {
		
	private static final Logger LOGGER = LoggerFactory.getLogger(NewServiceResource.class);
	
	@Context
	private SecurityContext securityContext;

	@Context
	private javax.ws.rs.core.Request request;

	@Context
	private HttpServletRequest httpRequest;

	private NewServiceService delegateService;

	private String implementationClass = "com.digitalml.rest.resources.codegentest.service.NewService.NewServiceServiceDefaultImpl";

	public void setImplementationClass(String className) {
		implementationClass = className;
	}

	public void setImplementationClass(Class clazz) {
		if (clazz == null)
			throw new IllegalArgumentException("Parameter clazz cannot be null");

		implementationClass = clazz.getName();
	}
		
	private NewServiceService getCurrentImplementation() {

		Object object = null;
		try {
			Class c = Class.forName(implementationClass, true, Thread.currentThread().getContextClassLoader());
			object = c.newInstance();

		} catch (ClassNotFoundException exc) {
			LOGGER.error(implementationClass + " not found");
			return null;

		} catch (IllegalAccessException exc) {
			LOGGER.error("Cannot access " + implementationClass);
			return null;

		} catch (InstantiationException exc) {
			LOGGER.error("Cannot instantiate " + implementationClass);
			return null;
		}

		if (!(object instanceof NewServiceService)) {
			LOGGER.error(implementationClass + " is not an instance of " + NewServiceService.class.getName());
			return null;
		}

		return (NewServiceService)object;
	}
	
	{
		delegateService = getCurrentImplementation();
	}
	
	public void setSecurityContext(SecurityContext securityContext) {
		this.securityContext = securityContext;
	}


	/**
	Method: _NewOperation_1

	Non-functional requirements:
	*/
	
	@GET
	public javax.ws.rs.core.Response _NewOperation_1(
		 com.digitalml.rest.resources.codegentest.Customer customer) {

		NewOperation1InputParametersDTO inputs = new NewServiceService.NewOperation1InputParametersDTO();
		// Prepare and check all input parameters

		inputs.setCustomer(customer);
	
		try {
			NewOperation1ReturnDTO returnValue = delegateService._NewOperation_1(securityContext, inputs);

			ObjectMapper mapper = new ObjectMapper();
			mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(mapper.writeValueAsString(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(304).entity(e.getMessage());
			return builder.build();
		} catch (JsonProcessingException e) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(500).entity(e.getMessage());
			return builder.build();
		} finally {
		}
	}
	

}