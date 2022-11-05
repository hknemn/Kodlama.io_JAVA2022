package kodlama.io.Devs.dataaccess.abstracts;

import kodlama.io.Devs.entities.concretes.*;

import java.util.*;

public interface ProgrammingLanguageRepository {
	void add(String name);

	void delete(String name);

	void update(String oldValue, String newValue);

	List<ProgrammingLanguage> getAll();

	String getById(int id);

}
