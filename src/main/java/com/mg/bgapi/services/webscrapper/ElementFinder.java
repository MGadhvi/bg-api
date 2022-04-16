package com.mg.bgapi.services.webscrapper;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.List;

public class ElementFinder {
	public static String getTranslation(Document document) {
		Elements translationElement = document.getElementsByClass("r r-lang-en r-translation");
		List<String> translation = translationElement.eachText();
		return translation.get(0);
	}

	public static String getVerse(Document document) {
		Elements verseElement = document.getElementsByClass("r r-title r-verse");
		List<String> verse = verseElement.eachText();
		return verse.get(0);
	}
}