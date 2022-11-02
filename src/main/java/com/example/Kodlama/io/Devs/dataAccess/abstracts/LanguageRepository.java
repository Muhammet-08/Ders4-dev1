package com.example.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import com.example.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageRepository {

	List<Language> getAll();
	
	Language getById(int id);
	
	void add(Language language);
	void delete(Language language);
	void update(Language language , int id);

	
}
