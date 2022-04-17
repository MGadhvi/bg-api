package com.mg.bgapi.services.webscrapper;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.List;
import java.util.Optional;

public class ElementFinder {
	public static Optional<String> getTranslation(Document document) {
		Elements translationElement = document.getElementsByClass("r r-lang-en r-translation");
		List<String> translation = translationElement.eachText();
		return Optional.ofNullable(translation.get(0));
	}

	public static Optional<String> getVerse(Document document) {
		Elements verseElement = document.getElementsByClass("r r-title r-verse");
		List<String> verse = verseElement.eachText();
		return Optional.ofNullable(verse.get(0));
	}
}