package com.tecsup.HospitalMdb.consultas.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "diagnosticos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Diagnostico {

    @Id
    private String id;
    private String idConsulta;
    private String descripcion;
    private String tipo;
}