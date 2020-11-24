package com.appsdeveloperblog.app.ws.ui.model.response;

import org.springframework.http.HttpStatus;

import java.util.Date;

public class ErrorMessage {

    private Date timestamp;
    private HttpStatus status;
    private String message;

    public ErrorMessage() {
    }

    public ErrorMessage(Date timestamp, HttpStatus status, String message) {
        this.timestamp = timestamp;
        this.message = message;
        this.status = status;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
