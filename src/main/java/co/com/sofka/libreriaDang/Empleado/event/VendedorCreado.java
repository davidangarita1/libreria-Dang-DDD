package co.com.sofka.libreriaDang.Empleado.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.libreriaDang.Empleado.value.Funcion;
import co.com.sofka.libreriaDang.Empleado.value.IdVendedor;

public class VendedorCreado extends DomainEvent {

    private final IdVendedor idVendedor;
    private final Funcion funcion;

    public VendedorCreado(IdVendedor idVendedor, Funcion funcion) {
        super("sofka.empleado.vendedorcreado");
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
