package com.tecsup.HospitalMdb.facturacion.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "detalle_facturas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetalleFactura {

    @Id
    private String id;
    private String idFactura;
    private String concepto;
    private Double monto;
}