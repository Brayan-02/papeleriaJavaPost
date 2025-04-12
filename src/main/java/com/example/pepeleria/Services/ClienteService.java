package com.example.pepeleria.Services;

import com.example.pepeleria.Models.Cliente;
import com.example.pepeleria.Repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;


    public List<Cliente> obtenerTodos() {
        return clienteRepository.findAll();
    }


    public Optional<Cliente> obtenerPorId(Long id) {
        return clienteRepository.findById(id);
    }


    public Cliente guardarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }


    public Cliente actualizarCliente(Long id, Cliente cliente) {
        if (clienteRepository.existsById(id)) {
            cliente.setIdCliente(id);
            return clienteRepository.save(cliente);
        }
        return null;
    }


    public boolean eliminarCliente(Long id) {
        if (clienteRepository.existsById(id)) {
            clienteRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
