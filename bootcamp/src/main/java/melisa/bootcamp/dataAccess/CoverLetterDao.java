package melisa.bootcamp.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import melisa.bootcamp.entities.CoverLetter;

public interface CoverLetterDao extends JpaRepository<CoverLetter, Integer>{

}