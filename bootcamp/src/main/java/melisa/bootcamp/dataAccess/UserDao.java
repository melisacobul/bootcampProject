package melisa.bootcamp.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import melisa.bootcamp.entities.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
