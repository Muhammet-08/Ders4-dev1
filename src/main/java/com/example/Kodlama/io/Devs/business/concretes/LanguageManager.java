package com.example.Kodlama.io.Devs.business.concretes;

import java.util.Iterator;
import java.util.List;
import java.util.random.RandomGenerator.LeapableGenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Kodlama.io.Devs.business.abstracts.LanguageService;
import com.example.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import com.example.Kodlama.io.Devs.entities.concretes.Language;
@Service //bu sınıf bir servicedir
public class LanguageManager implements LanguageService{

	private LanguageRepository languageRepository;
	
	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		
		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() {
		// TODO Auto-generated method stub
		return  languageRepository.getAll();
	}

	@Override
	public void add(Language language) {
			languageRepository.add(language);
		}
	

	@Override
	public void delete(Language language) {
		languageRepository.delete(language);
		
	}

	@Override
	public void update(Language language, int id) {
		languageRepository.update(language, id);
		
	}

	@Override
	public Language getById(int id) {
		
		return languageRepository.getById(id);
	}

}
