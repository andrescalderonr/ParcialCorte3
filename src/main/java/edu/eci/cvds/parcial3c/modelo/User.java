package edu.eci.cvds.parcial3c.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collation = "Usuarios")
public class User {
    @Id
    private String id;
    private String name;
    private String cedula;
    private String correo;
}
