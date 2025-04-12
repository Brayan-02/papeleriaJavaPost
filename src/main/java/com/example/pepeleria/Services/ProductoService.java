package com.example.pepeleria.Services;
import com.example.pepeleria.Models.Producto;
import com.example.pepeleria.Repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> obtenerTodos() {
        return productoRepository.findAll();
    }
    public Optional<Producto> obtenerPorId(Long id) {
        return productoRepository.findById(id);
    }
    public Producto guardarProducto(Producto producto) {
        return productoRepository.save(producto);
    }
    public Producto actualizarProducto(Long id, Producto producto) {
        if (productoRepository.existsById(id)) {
            producto.setIdProducto(id);
            return productoRepository.save(producto);
        }
        return null;
    }
    public boolean eliminarProducto(Long id) {
        if (productoRepository.existsById(id)) {
            productoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
