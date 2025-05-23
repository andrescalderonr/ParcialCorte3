package edu.eci.cvds.parcial3c.repository;

import edu.eci.cvds.parcial3c.modelo.Cita;

import java.util.List;

public interface CitaRepository {
    List<Cita> findAll();

    List<Cita> findByStatus();
}
