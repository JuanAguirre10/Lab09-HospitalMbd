package com.tecsup.HospitalMdb.seguridad.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "bitacoras")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bitacora {

    @Id
    private String id;
    private String idUsuario;
    private String accion;
    private LocalDateTime fechaHora;
}