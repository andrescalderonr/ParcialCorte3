package edu.eci.cvds.parcial3c.repository;

import edu.eci.cvds.parcial3c.modelo.Speciality;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SpecialityRepository extends MongoRepository<Speciality,String> {
}
