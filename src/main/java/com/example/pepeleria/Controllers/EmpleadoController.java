package com.example.pepeleria.Controllers;

import com.example.pepeleria.Models.Empleado;
import com.example.pepeleria.Services.EmpleadoService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping
    @Operation(summary = "Obtener todos los empleados")
    public List<Empleado> obtenerTodos() {
        return empleadoService.obtenerTodos();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener un empleado por ID")
    public Optional<Empleado> obtenerPorId(@PathVariable Long id) {
        return empleadoService.obtenerPorId(id);
    }

    @PostMapping
    @Operation(summary = "Guardar un nuevo empleado")
    public Empleado guardar(@RequestBody Empleado empleado) {
        return empleadoService.guardarEmpleado(empleado);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Actualizar un empleado")
    public Empleado actualizar(@PathVariable Long id, @RequestBody Empleado empleado) {
        return empleadoService.actualizarEmpleado(id, empleado);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar un empleado")
    public boolean eliminar(@PathVariable Long id) {
        return empleadoService.eliminarEmpleado(id);
    }
}
