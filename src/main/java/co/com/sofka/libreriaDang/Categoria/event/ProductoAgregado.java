package co.com.sofka.libreriaDang.Categoria.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.libreriaDang.Categoria.value.Descripcion;
import co.com.sofka.libreriaDang.Categoria.value.IdProducto;
import co.com.sofka.libreriaDang.Categoria.value.Precio;

public class ProductoAgregado extends DomainEvent {

    private final IdProducto idProducto;
    private final Precio precio;
    private final Descripcion descripcion;


    public ProductoAgregado(IdProducto idProducto, Precio precio, Descripcion descripcion) {
        super("sofka.categoria.productocreado");
        this.idProducto = idProducto;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public IdProducto getIdProducto() {
        return idProducto;
    }

    public Precio getPrecio() {
        return precio;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
