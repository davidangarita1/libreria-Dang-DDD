package co.com.sofka.libreriaDang.Categoria.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.libreriaDang.Generico.Nombre;

public class NombreActualizado extends DomainEvent {

    private final Nombre nombre;

    public NombreActualizado(Nombre nombre) {
        super("sofka.categoria.nombreactualizado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
