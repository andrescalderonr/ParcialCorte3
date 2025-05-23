package edu.eci.cvds.parcial3c.modelo;

import edu.eci.cvds.parcial3c.enums.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collation = "Especialidades")
public class Speciality {
    private Type type;
    private String description;
    private Doctor doctor;
    private String ubication;
}
