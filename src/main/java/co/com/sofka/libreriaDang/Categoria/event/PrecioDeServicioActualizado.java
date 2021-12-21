package co.com.sofka.libreriaDang.Categoria.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.libreriaDang.Categoria.value.IdServicio;
import co.com.sofka.libreriaDang.Categoria.value.Precio;

public class PrecioDeServicioActualizado extends DomainEvent {

    private final IdServicio idServicio;
    private final Precio precio;

    public PrecioDeServicioActualizado(IdServicio idServicio, Precio precio) {
        super("sofka.categoria.preciondeservicioactualizado");
        this.idServicio = idServicio;
        this.precio = precio;
    }

    public IdServicio getIdServicio() {
        return idServicio;
    }

    public Precio getPrecio() {
        return precio;
    }
}
