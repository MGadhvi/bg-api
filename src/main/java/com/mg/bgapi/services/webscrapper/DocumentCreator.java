package com.mg.bgapi.services.webscrapper;

import com.mg.bgapi.exceptions.VerseNotFoundException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class DocumentCreator {
	private static Document document;

	public static Document getDocumentRandom() {
		try {
			document = Jsoup.connect(MultipleVerseGenerator.checkUrl("https://vedabase.io/en/library/bg/" + RandomVerseGenerator.getRandomChapterNumber() + "/" + RandomVerseGenerator.getRandomVerseNumber())).get();
		} catch (IOException e) {
			getDocumentRandom();
		}
		return document;
	}

	public static Document getDocument(int chapter, int verse) {
		try {
			document = Jsoup.connect(MultipleVerseGenerator.checkUrl("https://vedabase.io/en/library/bg/" + chapter + "/" + verse)).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return document;
	}
}