package com.tecsup.HospitalMdb.consultas.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "recetas_medicas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecetaMedica {

    @Id
    private String id;
    private String idConsulta;
    private String indicaciones;
}