package com.example.pepeleria.Controllers;

import com.example.pepeleria.Models.DetalleVenta;
import com.example.pepeleria.Services.DetalleVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/detalles-venta")
public class DetalleVentaController {

    @Autowired
    private DetalleVentaService detalleVentaService;

    @GetMapping
    public List<DetalleVenta> obtenerTodos() {
        return detalleVentaService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Optional<DetalleVenta> obtenerPorId(@PathVariable Long id) {
        return detalleVentaService.obtenerPorId(id);
    }

    @PostMapping
    public DetalleVenta guardar(@RequestBody DetalleVenta detalleVenta) {
        return detalleVentaService.guardarDetalleVenta(detalleVenta);
    }

    @PutMapping("/{id}")
    public DetalleVenta actualizar(@PathVariable Long id, @RequestBody DetalleVenta detalleVenta) {
        return detalleVentaService.actualizarDetalleVenta(id, detalleVenta);
    }

    @DeleteMapping("/{id}")
    public boolean eliminar(@PathVariable Long id) {
        return detalleVentaService.eliminarDetalleVenta(id);
    }
}
