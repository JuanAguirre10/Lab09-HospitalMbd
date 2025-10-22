package com.tecsup.HospitalMdb.pacientes.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "historias_clinicas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HistoriaClinica {

    @Id
    private String id;
    private String idPaciente;
    private LocalDate fechaApertura;
    private String observaciones;
}