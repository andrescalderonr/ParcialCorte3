package edu.eci.cvds.parcial3c.service;

import edu.eci.cvds.parcial3c.enums.Status;
import edu.eci.cvds.parcial3c.modelo.Cita;
import edu.eci.cvds.parcial3c.repository.CitaRepository;
import edu.eci.cvds.parcial3c.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaService {
    @Autowired
    private CitaRepository citaRepository;

    private List<Cita> getAllCitas(){
        return citaRepository.findAll();
    }

    private List<Cita> findByStatys(Status status){
        return citaRepository.findByStatus();
    }

    private Cita createCita(Cita cita){
        if(cita.getUser() == null || cita.getFecha() == null || cita.getSpeciality() == null || cita.getDoctor() == null || cita.getStatus() == null || cita.getUbication() == null){
            cita.setUser(null);
            cita.setFecha(null);
            cita.setSpeciality(null);
            cita.setDoctor(null);
            cita.setStatus(null);
            cita.setUbication(null);
        }else{
            cita.setUser(cita.getUser());
            cita.setFecha(cita.getFecha());
            cita.setSpeciality(cita.getSpeciality());
            cita.setDoctor(cita.getDoctor());
            cita.setStatus(cita.getStatus());
            cita.setUbication(cita.getUbication());
        }
        return cita;
    }

}
