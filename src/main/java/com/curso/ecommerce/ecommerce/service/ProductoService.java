package com.curso.ecommerce.ecommerce.service;

import com.curso.ecommerce.ecommerce.model.Producto;

import java.util.Optional;

public interface ProductoService {
    public Producto save(Producto producto);
    // dice si existe o no
    public Optional<Producto> get(Integer id);
    public void delete(Integer id);
    public void update(Producto producto);
}
