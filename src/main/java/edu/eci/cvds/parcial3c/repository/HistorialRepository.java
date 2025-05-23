package edu.eci.cvds.parcial3c.repository;

import edu.eci.cvds.parcial3c.modelo.Historial;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HistorialRepository extends MongoRepository<Historial,String> {
}
