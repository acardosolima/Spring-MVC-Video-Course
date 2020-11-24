package com.appsdeveloperblog.app.ws.exceptions;

public class UserServiceException extends RuntimeException {

    private static final long serialVersionUID = 1348771109171435707L;

    public UserServiceException(String errorMessage) {
        super(errorMessage);
    }
}
