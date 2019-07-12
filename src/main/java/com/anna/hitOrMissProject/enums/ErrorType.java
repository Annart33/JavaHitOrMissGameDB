package com.anna.hitOrMissProject.enums;

public enum ErrorType {

	INVALID_NAME(601, "THIS NAME IS INVALID"), NOT_FOUND(602, "CAN'T FIND SCORE"), INSERTION_ERROR(603,"CAN'T INSERT THE SCORE"), GENERAL_ERROR(700, "GENERAL ERROR");

	private int errorNumber;
	private String errorMessage;

	private ErrorType(int errorNumber, String errorMessage) {
		this.errorNumber = errorNumber;
		this.errorMessage = errorMessage;
	}

	public int getErrorNumber() {
		return errorNumber;
	}

	public void setErrorNumber(int errorNumber) {
		this.errorNumber = errorNumber;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	

}
