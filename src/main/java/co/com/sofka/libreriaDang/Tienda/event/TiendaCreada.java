package co.com.sofka.libreriaDang.Tienda.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.libreriaDang.Generico.Nombre;

public class TiendaCreada extends DomainEvent {

    private final Nombre nombre;

    public TiendaCreada(Nombre nombre) {
        super("sofka.tienda.tiendacreada");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
