package com.tecsup.HospitalMdb.consultas.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "detalle_recetas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetalleReceta {

    @Id
    private String id;
    private String idReceta;
    private String medicamento;
    private String dosis;
    private String frecuencia;
    private String duracion;
}