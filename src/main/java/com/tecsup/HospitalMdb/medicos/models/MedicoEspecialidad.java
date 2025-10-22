package com.tecsup.HospitalMdb.medicos.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "medico_especialidades")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedicoEspecialidad {

    @Id
    private String id;
    private String idMedico;
    private String idEspecialidad;
}