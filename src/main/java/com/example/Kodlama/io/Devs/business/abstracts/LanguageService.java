package com.example.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import com.example.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageService {

	List<Language> getAll();
	Language getById(int id);
	void add(Language language);
	void delete(Language language);
	void update(Language language, int id);
	
}
