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
		multipleVerses.put("/bg/5/27", BASEURL + "5/27-28/");
		multipleVerses.put("/bg/5/28", BASEURL + "5/27-28/");
		multipleVerses.put("/bg/6/11", BASEURL + "6/11-12/");
		multipleVerses.put("/bg/6/12", BASEURL + "6/11-12/");
		multipleVerses.put("/bg/6/13", BASEURL + "6/13-14/");
		multipleVerses.put("/bg/6/14", BASEURL + "6/13-14/");
		multipleVerses.put("/bg/6/20", BASEURL + "6/20-23/");
		multipleVerses.put("/bg/6/23", BASEURL + "6/20-23/");
		multipleVerses.put("/bg/10/4", BASEURL + "10/4-5/");
		multipleVerses.put("/bg/10/5", BASEURL + "10/4-5/");
		multipleVerses.put("/bg/10/12", BASEURL + "10/12-13/");
		multipleVerses.put("/bg/10/13", BASEURL + "10/12-13/");
		multipleVerses.put("/bg/11/10", BASEURL + "11/10-11/");
		multipleVerses.put("/bg/11/11", BASEURL + "11/10-11/");
		multipleVerses.put("/bg/11/26", BASEURL + "11/26-27/");
		multipleVerses.put("/bg/11/27", BASEURL + "11/26-27/");
		multipleVerses.put("/bg/11/41", BASEURL + "11/41-42/");
		multipleVerses.put("/bg/11/42", BASEURL + "11/41-42/");
		multipleVerses.put("/bg/12/3", BASEURL + "12/3-4/");
		multipleVerses.put("/bg/12/4", BASEURL + "12/3-4/");
		multipleVerses.put("/bg/12/6", BASEURL + "12/6-7/");
		multipleVerses.put("/bg/12/7", BASEURL + "12/6-7/");
		multipleVerses.put("/bg/12/13", BASEURL + "12/13-14/");
		multipleVerses.put("/bg/12/14", BASEURL + "12/13-14/");
		multipleVerses.put("/bg/12/18", BASEURL + "12/18-19/");
		multipleVerses.put("/bg/12/19", BASEURL + "12/18-19/");
		multipleVerses.put("/bg/13/1", BASEURL + "13/1-2/");
		multipleVerses.put("/bg/13/2", BASEURL + "13/1-2/");
		multipleVerses.put("/bg/13/6", BASEURL + "13/6-7/");
		multipleVerses.put("/bg/13/7", BASEURL + "13/6-7/");
		multipleVerses.put("/bg/13/8", BASEURL + "13/8-12/");
		multipleVerses.put("/bg/13/9", BASEURL + "13/8-12/");
		multipleVerses.put("/bg/13/10", BASEURL + "13/8-12/");
		multipleVerses.put("/bg/13/11", BASEURL + "13/8-12/");
		multipleVerses.put("/bg/13/12", BASEURL + "13/8-12/");
		multipleVerses.put("/bg/14/22", BASEURL + "14/22-25/");
		multipleVerses.put("/bg/14/23", BASEURL + "114/22-25");
		multipleVerses.put("/bg/14/24", BASEURL + "14/22-25/");
		multipleVerses.put("/bg/14/25", BASEURL + "14/22-25");
		multipleVerses.put("/bg/15/3", BASEURL + "15/3-4");
		multipleVerses.put("/bg/15/4", BASEURL + "15/3-4");
		multipleVerses.put("/bg/16/1", BASEURL + "16/1-3");
		multipleVerses.put("/bg/16/2", BASEURL + "16/1-3");
		multipleVerses.put("/bg/16/3", BASEURL + "16/1-3");
		multipleVerses.put("/bg/16/11", BASEURL + "16/11-12");
		multipleVerses.put("/bg/16/12", BASEURL + "16/11-12");
		multipleVerses.put("/bg/16/13", BASEURL + "16/13-15");
		multipleVerses.put("/bg/16/14", BASEURL + "16/13-15");
		multipleVerses.put("/bg/16/15", BASEURL + "16/13-15");
		multipleVerses.put("/bg/17/5", BASEURL + "17/5-6");
		multipleVerses.put("/bg/17/6", BASEURL + "17/5-6");
		multipleVerses.put("/bg/17/26", BASEURL + "17/26-27");
		multipleVerses.put("/bg/17/27", BASEURL + "17/26-27");
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