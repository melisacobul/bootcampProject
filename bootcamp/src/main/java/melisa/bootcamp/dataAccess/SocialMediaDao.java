package melisa.bootcamp.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import melisa.bootcamp.entities.SocialMedia;

public interface SocialMediaDao extends JpaRepository<SocialMedia, Integer>{

}
