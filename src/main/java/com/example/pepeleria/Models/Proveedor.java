package com.example.pepeleria.Models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Proveedor {

    public void setIdProveedor(Long idProveedor) {
        this.idProveedor = idProveedor;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProveedor;
    private String nombre;
    private String telefono;
    private String correo;
    private String direccion;

}
