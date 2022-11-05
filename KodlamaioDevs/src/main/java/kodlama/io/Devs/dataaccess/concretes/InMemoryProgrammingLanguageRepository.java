package kodlama.io.Devs.dataaccess.concretes;

import java.util.*;

import org.springframework.stereotype.Repository;

import kodlama.io.Devs.dataaccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

	public static List<ProgrammingLanguage> languages;

	public InMemoryProgrammingLanguageRepository() {
		languages = new ArrayList<ProgrammingLanguage>();

	}

	public void add(String name) {
		boolean isThere = false;
		for (ProgrammingLanguage language : languages) {
			if (language.getName().equals(name)) {
				isThere = true;
				break;
			}
		}
		if (!isThere) {
			languages.add(new ProgrammingLanguage(languages.size() + 1, name));
		} else {
			System.out.println(name + " has already exist in database");
		}
	}

	public void delete(String name) {
		boolean isThere = false;
		int deletionId = 0;
		for (ProgrammingLanguage language : languages) {
			if (language.getName().equals(name)) {
				isThere = true;
				break;
			}
			deletionId++;
		}
		if (isThere) {
			languages.remove(deletionId);
		} else {
			System.out.println(name + " doesnt exist in database");
		}

	}

	public void update(String oldValue, String newValue) {
		boolean isThere = false;
		int indexId = 0;
		int realId = 1;
		for (ProgrammingLanguage language : languages) {
			if (language.getName().equals(oldValue)) {
				isThere = true;
				realId = language.getId();
				break;
			}
			indexId++;
		}
		if (isThere) {
			languages.remove(indexId);
			languages.add(indexId, new ProgrammingLanguage(realId, newValue));
		} else {
			System.out.println(oldValue + " doesnt exist in database");
		}

	}

	public List<ProgrammingLanguage> getAll() {
		return languages;
	}

	public String getById(int id) {
		for (ProgrammingLanguage language : languages) {
			if (language.getId() == id) {
				return language.getName();
			}
		}
		return "id doesnt exist in database";
	}

}
