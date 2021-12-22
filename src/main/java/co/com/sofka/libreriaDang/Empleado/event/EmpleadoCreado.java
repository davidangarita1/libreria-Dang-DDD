package co.com.sofka.libreriaDang.Empleado.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.libreriaDang.Empleado.Gerente;
import co.com.sofka.libreriaDang.Generico.Nombre;

public class EmpleadoCreado extends DomainEvent {
    private final Nombre nombre;
    private final Gerente gerente;

    public EmpleadoCreado(Nombre nombre, Gerente gerente) {
        super("sofka.empleado.empleadocreado");
        this.nombre = nombre;
        this.gerente = gerente;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Gerente getGerente() {
        return gerente;
    }
}
