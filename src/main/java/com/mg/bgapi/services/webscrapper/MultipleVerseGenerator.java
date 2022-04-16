package com.mg.bgapi.services.webscrapper;

import java.util.HashMap;

public class MultipleVerseGenerator {
	private static final String BASEURL = "https://vedabase.io/en/library/bg/";
	private static final HashMap<String, String> multipleVerses = new HashMap<>();

	static {
		multipleVerses.put("/bg/1/16", BASEURL + "1/16-18/");
		multipleVerses.put("/bg/1/17", BASEURL + "1/16-18/");
		multipleVerses.put("/bg/1/18", BASEURL + "1/16-18/");
		multipleVerses.put("/bg/1/21", BASEURL + "1/21-22/");
		multipleVerses.put("/bg/1/22", BASEURL + "1/21-22/");
		multipleVerses.put("/bg/1/32", BASEURL + "1/32-35/");
		multipleVerses.put("/bg/1/33", BASEURL + "1/32-35/");
		multipleVerses.put("/bg/1/34", BASEURL + "1/32-35/");
		multipleVerses.put("/bg/1/37", BASEURL + "1/37-38/");
		multipleVerses.put("/bg/1/35", BASEURL + "1/32-35/");
		multipleVerses.put("/bg/1/38", BASEURL + "1/37-38/");
		multipleVerses.put("/bg/2/42", BASEURL + "2/42-43/");
		multipleVerses.put("/bg/2/43", BASEURL + "2/42-43/");
		multipleVerses.put("/bg/5/8", BASEURL + "5/8-9/");
		multipleVerses.put("/bg/5/9", BASEURL + "5/8-9/");
	}

	public static String checkUrl(String url) {
		for (String urlPattern : multipleVerses.keySet()) {
			if (url.contains(urlPattern)) {
				url = multipleVerses.get(urlPattern);
			}
		}
		return url;
	}
}