package com.example.Kodlama.io.Devs.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Kodlama.io.Devs.business.abstracts.LanguageService;
import com.example.Kodlama.io.Devs.business.concretes.LanguageManager;
import com.example.Kodlama.io.Devs.dataAccess.concretes.InMemoryLanguageRepository;
import com.example.Kodlama.io.Devs.entities.concretes.Language;

//annatotion
@RestController
@RequestMapping("/api/languages")
public class LanguageControllers {

	private LanguageService languageService;

	@Autowired
	public LanguageControllers(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@GetMapping("/getall")
	public List<Language> getAll(){
		return languageService.getAll();
	}
	@PostMapping("/add")
	public void add(Language language) {
		languageService.add(language);
	}
	@DeleteMapping("/delete")
	public void delete(Language language) {
		languageService.delete(language);
	}
	
	@PutMapping("/update")
	public void update(Language language,int id) {
		languageService.update(language, id);
		
	}
	
	@GetMapping("/{id}")
	public Language getById(int id) {
		return languageService.getById(id);
	}
	
	}
