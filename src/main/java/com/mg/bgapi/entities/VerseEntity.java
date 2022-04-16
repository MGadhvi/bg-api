package com.mg.bgapi.entities;

public class VerseEntity {
	private String verse;
	private String translation;

	public VerseEntity(String verse, String translation) {
		this.verse = verse;
		this.translation = translation;
	}

	public String getVerse() {
		return verse;
	}

	public void setVerse(String verse) {
		this.verse = verse;
	}

	public String getTranslation() {
		return translation;
	}

	public void setTranslation(String translation) {
		this.translation = translation;
	}
}
