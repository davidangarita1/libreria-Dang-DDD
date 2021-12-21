package co.com.sofka.libreriaDang.Empleado.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.libreriaDang.Generico.Nombre;

public class EmpleadoCreado extends DomainEvent {
    private final Nombre nombre;

    public EmpleadoCreado(Nombre nombre) {
        super("sofka.empleado.empleadocreado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
