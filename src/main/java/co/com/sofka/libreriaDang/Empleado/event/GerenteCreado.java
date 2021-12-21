package co.com.sofka.libreriaDang.Empleado.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.libreriaDang.Empleado.value.Funcion;
import co.com.sofka.libreriaDang.Empleado.value.IdGerente;

public class GerenteCreado extends DomainEvent {

    private final IdGerente idGerente;
    private final Funcion funcion;

    public GerenteCreado(IdGerente idGerente, Funcion funcion) {
        super("sofka.empleado.gerentecreado");
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
