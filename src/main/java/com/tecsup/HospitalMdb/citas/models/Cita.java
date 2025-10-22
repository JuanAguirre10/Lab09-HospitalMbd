package com.tecsup.HospitalMdb.citas.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalTime;

@Document(collection = "citas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cita {

    @Id
    private String id;
    private String idPaciente;
    private String idMedico;
    private LocalDate fecha;
    private LocalTime hora;
    private String motivo;
    private String estado;
}