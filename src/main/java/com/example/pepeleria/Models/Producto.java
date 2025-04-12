package com.example.pepeleria.Models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Producto {

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;
    private String nombre;
    private String descripcion;
    private Double precio;
    private int stock;


    @ManyToOne
    @JoinColumn(name = "id_proveedor")
    private Proveedor proveedor;
}
