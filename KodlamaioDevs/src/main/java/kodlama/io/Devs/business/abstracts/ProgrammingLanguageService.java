package kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	void add();

	void delete();

	void update();

	List<ProgrammingLanguage> getAll();

	String getById();
}
