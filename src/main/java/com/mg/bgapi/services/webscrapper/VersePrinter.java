package com.mg.bgapi.services.webscrapper;

import org.jsoup.nodes.Document;

import static com.mg.bgapi.services.webscrapper.DocumentCreator.*;
import static com.mg.bgapi.services.webscrapper.ElementFinder.*;

public class VersePrinter {
	public static void getBGVerseRandom() {
		Document document = getDocumentRandom();
		System.out.println(getVerse(document));
		System.out.println(getTranslation(document));
	}

	public static void getBGVerse(int chapter, int verse) {
		Document document = getDocument(chapter, verse);
		System.out.println(getVerse(document));
		System.out.println(getTranslation(document));
	}
}
