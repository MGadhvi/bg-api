package com.mg.bgapi.services.webscrapper;

import java.util.Random;

public class VerseGenerator {

	public static String getRandomChapterNumber() {
		Random random = new Random();
		int chapter = random.nextInt(18) + 1;
		return Integer.toString(chapter);

	}

	public static String getRandomVerseNumber() {
		Random random = new Random();
		int chapter = random.nextInt(78) + 1;
		return Integer.toString(chapter);
	}

}
