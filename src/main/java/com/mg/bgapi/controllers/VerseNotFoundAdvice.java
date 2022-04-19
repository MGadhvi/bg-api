package com.mg.bgapi.controllers;

import com.mg.bgapi.exceptions.ErrorMessage;
import com.mg.bgapi.exceptions.VerseNotFoundException;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class VerseNotFoundAdvice {

	@ExceptionHandler(VerseNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ErrorMessage verseNotFoundHandler(VerseNotFoundException e, WebRequest request) {
		return new ErrorMessage(request.getDescription(false), e.getMessage());
	}
}
