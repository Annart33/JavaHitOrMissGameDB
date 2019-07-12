package com.anna.hitOrMissProject.beans;

public class Error {

		private int errorCode;
		private String errorMessage;
		private String internalMessage;

		public Error() {
		}

		public Error(int errorCode, String errorMessage, String internalMessage) {
			this.errorCode = errorCode;
			this.errorMessage = errorMessage;
			this.internalMessage = internalMessage;
		}

		public int getErrorCode() {
			return errorCode;
		}

		public void setErrorCode(int errorCode) {
			this.errorCode = errorCode;
		}

		public String getErrorMessage() {
			return errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getInternalMessage() {
			return internalMessage;
		}

		public void setInternalMessage(String internalMessage) {
			this.internalMessage = internalMessage;
		}

		@Override
		public String toString() {
			return "ErrorBean [errorCode=" + errorCode + ", errorMessage=" + errorMessage + ", internalMessage="
					+ internalMessage + "]";
		}

	}



