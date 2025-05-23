package edu.eci.cvds.parcial3c.service;

import edu.eci.cvds.parcial3c.modelo.Speciality;
import edu.eci.cvds.parcial3c.repository.SpecialityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpecialityService {
    @Autowired
    private SpecialityRepository specialityRepository;
    public Speciality createSpeciality(Speciality speciality) {
        if (speciality.getDescription() == null || speciality.getUbication() == null || speciality.getType() == null || speciality.getDoctor() == null ) {
            speciality.setDescription(null);
            speciality.setUbication(null);
            speciality.setType(null);
            speciality.setDoctor(null);
        }
        else {
            speciality.setDescription(speciality.getDescription());
            speciality.setUbication(speciality.getUbication());
            speciality.setDoctor(speciality.getDoctor());
            speciality.setType(speciality.getType());
            return specialityRepository.save(speciality);
        }
        return speciality;
    }
}
