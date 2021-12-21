package co.com.sofka.libreriaDang.Categoria.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.libreriaDang.Categoria.value.Descripcion;
import co.com.sofka.libreriaDang.Categoria.value.IdProducto;

public class DescripcionDeProductoActualizado extends DomainEvent {

    private final IdProducto idProducto;
    private final Descripcion descripcion;

    public DescripcionDeProductoActualizado(IdProducto idProducto, Descripcion descripcion) {
        super("sofka.categoria.descripciondeproductoactualizado");
        this.idProducto = idProducto;
        this.descripcion = descripcion;
    }

    public IdProducto getIdProducto() {
        return idProducto;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
