package com.example.pepeleria.Services;

import com.example.pepeleria.Models.Proveedor;
import com.example.pepeleria.Repositories.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProveedorService {

    @Autowired
    private ProveedorRepository proveedorRepository;


    public List<Proveedor> obtenerTodos() {
        return proveedorRepository.findAll();
    }


    public Optional<Proveedor> obtenerPorId(Long id) {
        return proveedorRepository.findById(id);
    }


    public Proveedor guardarProveedor(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }


    public Proveedor actualizarProveedor(Long id, Proveedor proveedor) {
        if (proveedorRepository.existsById(id)) {
            proveedor.setIdProveedor(id);
            return proveedorRepository.save(proveedor);
        }
        return null;
    }


    public boolean eliminarProveedor(Long id) {
        if (proveedorRepository.existsById(id)) {
            proveedorRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
