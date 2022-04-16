package com.mg.bgapi.controllers;

import com.mg.bgapi.entities.VerseEntity;
import com.mg.bgapi.services.webscrapper.ElementFinder;
import org.jsoup.nodes.Document;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.mg.bgapi.services.webscrapper.DocumentCreator.getDocument;

@RestController
@RequestMapping("/api/bg/")
public class BGRestController {

	@GetMapping("/{chapter}/{verse}")
	public VerseEntity getVerse(@PathVariable("chapter") int chapter,
								@PathVariable("verse") int verse) {
		Document document = getDocument(chapter, verse);

		return new VerseEntity(ElementFinder.getVerse(document), ElementFinder.getTranslation(document));
	}
}
