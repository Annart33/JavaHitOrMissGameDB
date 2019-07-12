package com.anna.hitOrMissProject.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

@Provider
public class ExceptionHandler {

	//@ExceptionHandler(Exception.class)
	public Response toResponse(Throwable exception) {

		if (exception instanceof ApplicationException) {
			ApplicationException applicationException = (ApplicationException) exception;

			return Response.status(applicationException.getErrorType().getErrorNumber()).build();

		}

		return Response.status(700).build();
	}

}
