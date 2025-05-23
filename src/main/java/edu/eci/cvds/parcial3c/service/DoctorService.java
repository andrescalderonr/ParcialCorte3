package edu.eci.cvds.parcial3c.service;

import edu.eci.cvds.parcial3c.modelo.Doctor;
import edu.eci.cvds.parcial3c.modelo.User;
import edu.eci.cvds.parcial3c.modelo.Doctor;
import edu.eci.cvds.parcial3c.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }


    public Optional<Doctor> getdoctorById(String id)  {
        return doctorRepository.findById(id);
    }


    public List<Doctor> getdoctorsByName(String name) {
        return doctorRepository.findByName(name);
    }



    public Doctor createDoctor(Doctor doctor) {
        if (doctor.getName() == null ||  doctor.getCorreo() == null) {
            doctor.setName(null);
            doctor.setCorreo(null);
        }
        if (doctorRepository.findById(doctor.getCorreo()).isPresent()) {
            doctor.setName(null);
            doctor.setCorreo(null);
        } else {
            doctor.setName(doctor.getName());
            doctor.setCorreo(doctor.getCorreo());
            return doctorRepository.save(doctor);
        }
        return doctor;
    }
}
