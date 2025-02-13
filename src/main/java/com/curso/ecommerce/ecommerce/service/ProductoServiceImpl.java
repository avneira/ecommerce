package com.curso.ecommerce.ecommerce.service;

import com.curso.ecommerce.ecommerce.model.Producto;
import com.curso.ecommerce.ecommerce.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    private ProductoRepository productoRepository;

    //metodo guardar
    @Override
    public Producto save(Producto producto) {
        return productoRepository .save(producto);
    }


    @Override
    public Optional<Producto> get(Integer id) {
        return productoRepository.findById(id);
    }

    @Override
    public void delete(Integer id) {
        productoRepository.deleteById(id);
    }

    // cuando al objeto le mandamos
    @Override
    public void update(Producto producto) {
        productoRepository.save(producto);
    }
}
