package edu.eci.cvds.parcial3c.service;

import edu.eci.cvds.parcial3c.repository.HistorialRepository;
import edu.eci.cvds.parcial3c.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistorialService {
    @Autowired
    private HistorialRepository historialRepository;
}
