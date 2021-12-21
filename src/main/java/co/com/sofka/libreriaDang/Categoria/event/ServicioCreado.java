package co.com.sofka.libreriaDang.Categoria.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.libreriaDang.Categoria.value.Descripcion;
import co.com.sofka.libreriaDang.Categoria.value.IdServicio;
import co.com.sofka.libreriaDang.Categoria.value.Precio;

public class ServicioCreado extends DomainEvent {

    private final IdServicio idServicio;
    private final Precio precio;
    private final Descripcion descripcion;

    public ServicioCreado(IdServicio idServicio, Precio precio, Descripcion descripcion) {
        super("sofka.categoria.serviciocreado");
        this.idServicio = idServicio;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public IdServicio getIdServicio() {
        return idServicio;
    }

    public Precio getPrecio() {
        return precio;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
