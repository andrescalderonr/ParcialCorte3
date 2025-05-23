package edu.eci.cvds.parcial3c.modelo;

import edu.eci.cvds.parcial3c.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collation = "Citas")
public class Cita {
    @Id
    private String id;
    private User user;
    private LocalDate fecha;
    private Speciality speciality;
    private Doctor doctor;
    private String ubication;
    private Status status;

}
