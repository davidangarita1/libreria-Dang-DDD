package co.com.sofka.libreriaDang.Empleado.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.libreriaDang.Empleado.value.Funcion;
import co.com.sofka.libreriaDang.Empleado.value.IdCajero;

public class FuncionDeCajeroActualizado extends DomainEvent {

    private final IdCajero idCajero;
    private final Funcion funcion;

    public FuncionDeCajeroActualizado(IdCajero idCajero, Funcion funcion) {
        super("sofka.empleado.funciondecajeroactualizado");
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
