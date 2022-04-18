package com.mg.bgapi.controllers;

import com.mg.bgapi.entities.VerseEntity;
import com.mg.bgapi.exceptions.VerseNotFoundException;
import com.mg.bgapi.services.webscrapper.DocumentCreator;
import com.mg.bgapi.services.webscrapper.ElementFinder;
import org.jsoup.nodes.Document;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bg/")
public class BGRestController {

	@GetMapping("/{chapter}/{verse}")
	public VerseEntity getVerse(@PathVariable("chapter") int chapter,
								@PathVariable("verse") int verse) {

		Document document = DocumentCreator.getDocument(chapter, verse);

		VerseEntity verseEntity = new VerseEntity(
				ElementFinder.getVerse(document),
				ElementFinder.getTranslation(document));

		if (verseEntity.getVerse() == null || verseEntity.getTranslation() == null) {
			throw new VerseNotFoundException(chapter, verse);
		} else {
			return verseEntity;
		}
	}
}

