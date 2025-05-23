package edu.eci.cvds.parcial3c.repository;

import edu.eci.cvds.parcial3c.modelo.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User,String> {

    List<User> findByName(String name);

    Optional<Object> findByEmail(String correo);
}
