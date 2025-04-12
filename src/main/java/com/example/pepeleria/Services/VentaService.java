package com.example.pepeleria.Services;

import com.example.pepeleria.Models.Venta;
import com.example.pepeleria.Repositories.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VentaService {

    @Autowired
    private VentaRepository ventaRepository;


    public List<Venta> obtenerTodos() {
        return ventaRepository.findAll();
    }


    public Optional<Venta> obtenerPorId(Long id) {
        return ventaRepository.findById(id);
    }


    public Venta guardarVenta(Venta venta) {
        return ventaRepository.save(venta);
    }


    public Venta actualizarVenta(Long id, Venta venta) {
        if (ventaRepository.existsById(id)) {
            venta.setIdVenta(id);
            return ventaRepository.save(venta);
        }
        return null;
    }


    public boolean eliminarVenta(Long id) {
        if (ventaRepository.existsById(id)) {
            ventaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
