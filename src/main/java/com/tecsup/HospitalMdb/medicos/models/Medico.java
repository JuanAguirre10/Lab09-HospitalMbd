package com.tecsup.HospitalMdb.medicos.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "medicos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Medico {

    @Id
    private String id;
    private String nombres;
    private String apellidos;
    private String colegiatura;
    private String telefono;
    private String correo;
    private String estado;
}