package co.com.sofka.libreriaDang.Empleado.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.libreriaDang.Empleado.value.Funcion;
import co.com.sofka.libreriaDang.Empleado.value.IdVendedor;

public class FuncionDeVendedorActualizado extends DomainEvent {

    private final IdVendedor idVendedor;
    private final Funcion funcion;

    public FuncionDeVendedorActualizado(IdVendedor idVendedor, Funcion funcion) {
        super("sofka.empleado.funciondevendedoractualizado");
        this.idVendedor = idVendedor;
        this.funcion = funcion;
    }

    public IdVendedor getIdVendedor() {
        return idVendedor;
    }

    public Funcion getFuncion() {
        return funcion;
    }
}
