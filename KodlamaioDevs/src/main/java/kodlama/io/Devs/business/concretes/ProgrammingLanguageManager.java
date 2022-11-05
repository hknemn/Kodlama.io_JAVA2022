package kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.dataaccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository programmingLanguageRepository;

	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
		add();
		delete();
		update();
	}

	public void add() {
		programmingLanguageRepository.add("C#");
		programmingLanguageRepository.add("C");
		programmingLanguageRepository.add("Pyhton");
		programmingLanguageRepository.add("Java");

	}

	public void delete() {
		programmingLanguageRepository.delete("C");
		programmingLanguageRepository.delete("Fortran");

	}

	public void update() {
		programmingLanguageRepository.update("Pyhton", "Python");
		programmingLanguageRepository.update("GO", "Go");

	}

	public List<ProgrammingLanguage> getAll() {
		return programmingLanguageRepository.getAll();

	}

	public String getById() {
		return programmingLanguageRepository.getById(1);

	}

}
