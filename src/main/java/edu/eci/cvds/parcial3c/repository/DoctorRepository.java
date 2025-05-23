package edu.eci.cvds.parcial3c.repository;

import edu.eci.cvds.parcial3c.modelo.Doctor;
import edu.eci.cvds.parcial3c.modelo.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface DoctorRepository extends MongoRepository<Doctor,String> {
    List<Doctor> findByName(String name);
}
