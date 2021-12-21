package co.com.sofka.libreriaDang.Categoria.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.libreriaDang.Generico.Nombre;

public class CategoriaCreada extends DomainEvent {
    private final Nombre nombre;

    public CategoriaCreada(Nombre nombre) {
        super("sofka.categoria.categoriacreada");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
