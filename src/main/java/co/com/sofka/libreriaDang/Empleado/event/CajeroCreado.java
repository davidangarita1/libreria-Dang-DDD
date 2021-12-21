package co.com.sofka.libreriaDang.Empleado.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.libreriaDang.Empleado.value.Funcion;
import co.com.sofka.libreriaDang.Empleado.value.IdCajero;

public class CajeroCreado extends DomainEvent {

    private final IdCajero idCajero;
    private final Funcion funcion;

    public CajeroCreado(IdCajero idCajero, Funcion funcion) {
        super("sofka.empleado.cajerocreado");
        this.idCajero = idCajero;
        this.funcion = funcion;
    }

    public IdCajero getIdCajero() {
        return idCajero;
    }

    public Funcion getFuncion() {
        return funcion;
    }
}
