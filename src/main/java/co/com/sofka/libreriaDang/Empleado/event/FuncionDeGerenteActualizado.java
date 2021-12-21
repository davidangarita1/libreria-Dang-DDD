package co.com.sofka.libreriaDang.Empleado.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.libreriaDang.Empleado.value.Funcion;
import co.com.sofka.libreriaDang.Empleado.value.IdGerente;

public class FuncionDeGerenteActualizado extends DomainEvent {

    private final IdGerente idGerente;
    private final Funcion funcion;

    public FuncionDeGerenteActualizado(IdGerente idGerente, Funcion funcion) {
        super("sofka.empleado.funciondegerenteactualizado");
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
