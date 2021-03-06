package org.koushik.practice.test.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.koushik.practice.test.model.ErrorMessage;

@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException>{

	@Override
	public Response toResponse(DataNotFoundException ex) {

		/*
		 * 
		 * Throwing custom error messages when there is an 404 error
		 * 
		 */
		ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(), 404, "http://google.com ");
		return Response.status(Status.NOT_FOUND)
				.entity(errorMessage)
				.build();
	}

}
