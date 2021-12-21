package co.com.sofka.libreriaDang.Categoria.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.libreriaDang.Categoria.value.Descripcion;
import co.com.sofka.libreriaDang.Categoria.value.IdServicio;

public class DescripcionDeServicioActualizado extends DomainEvent {

    private final IdServicio idServicio;
    private final Descripcion descripcion;

    public DescripcionDeServicioActualizado(IdServicio idServicio, Descripcion descripcion) {
        super("sofka.categoria.descripciondeservicioactualizado");
        this.idServicio = idServicio;
        this.descripcion = descripcion;
    }

    public IdServicio getIdServicio() {
        return idServicio;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
