package co.com.sofka.libreriaDang.Empleado.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.libreriaDang.Empleado.value.Funcion;
import co.com.sofka.libreriaDang.Empleado.value.IdGerente;

public class GerenteActualizado extends DomainEvent {

    private final IdGerente idGerente;
    private final Funcion funcion;

    public GerenteActualizado(IdGerente idGerente, Funcion funcion) {
        super("sofka.empleado.gerenteactualizado");
        this.idGerente = idGerente;
        this.funcion = funcion;
    }

    public IdGerente getIdGerente() {
        return idGerente;
    }

    public Funcion getFuncion() {
        return funcion;
    }
}
