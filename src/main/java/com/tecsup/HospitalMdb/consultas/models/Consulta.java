package com.tecsup.HospitalMdb.consultas.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalTime;

@Document(collection = "consultas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Consulta {

    @Id
    private String id;
    private String idCita;
    private String idMedico;
    private String idPaciente;
    private LocalDate fecha;
    private LocalTime hora;
    private String motivoConsulta;
    private String observaciones;
}