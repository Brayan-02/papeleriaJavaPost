package com.example.pepeleria.Services;

import com.example.pepeleria.Models.DetalleVenta;
import com.example.pepeleria.Repositories.DetalleVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleVentaService {

    @Autowired
    private DetalleVentaRepository detalleVentaRepository;


    public List<DetalleVenta> obtenerTodos() {
        return detalleVentaRepository.findAll();
    }


    public Optional<DetalleVenta> obtenerPorId(Long id) {
        return detalleVentaRepository.findById(id);
    }


    public DetalleVenta guardarDetalleVenta(DetalleVenta detalleVenta) {
        return detalleVentaRepository.save(detalleVenta);
    }


    public DetalleVenta actualizarDetalleVenta(Long id, DetalleVenta detalleVenta) {
        if (detalleVentaRepository.existsById(id)) {
            detalleVenta.setIdDetalle(id);
            return detalleVentaRepository.save(detalleVenta);
        }
        return null;
    }


    public boolean eliminarDetalleVenta(Long id) {
        if (detalleVentaRepository.existsById(id)) {
            detalleVentaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
