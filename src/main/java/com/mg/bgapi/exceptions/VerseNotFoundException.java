package com.mg.bgapi.exceptions;

public class VerseNotFoundException extends RuntimeException {
	public VerseNotFoundException(int chapter, int verse) {
		super("Verse not found: BG: " + chapter + "." + verse);
	}
}
