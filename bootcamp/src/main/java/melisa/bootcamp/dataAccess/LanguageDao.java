package melisa.bootcamp.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import melisa.bootcamp.entities.Language;

public interface LanguageDao extends JpaRepository<Language, Integer>{

}
