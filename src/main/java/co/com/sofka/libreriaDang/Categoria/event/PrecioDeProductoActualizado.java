package co.com.sofka.libreriaDang.Categoria.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.libreriaDang.Categoria.value.IdProducto;
import co.com.sofka.libreriaDang.Categoria.value.Precio;

public class PrecioDeProductoActualizado extends DomainEvent {

    private final IdProducto idProducto;
    private final Precio precio;

    public PrecioDeProductoActualizado(IdProducto idProducto, Precio precio) {
        super("sofka.categoria.preciondeproductoactualizado");
        this.idProducto = idProducto;
        this.precio = precio;
    }

    public IdProducto getIdProducto() {
        return idProducto;
    }

    public Precio getPrecio() {
        return precio;
    }
}
