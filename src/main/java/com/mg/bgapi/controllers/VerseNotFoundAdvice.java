package com.mg.bgapi.controllers;

import com.mg.bgapi.exceptions.VerseNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class VerseNotFoundAdvice {

	@ExceptionHandler(VerseNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String verseNotFoundHandler(VerseNotFoundException e) {
		return e.getMessage();
	}
}
