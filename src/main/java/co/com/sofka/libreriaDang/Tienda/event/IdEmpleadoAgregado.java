package co.com.sofka.libreriaDang.Tienda.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.libreriaDang.Empleado.value.IdEmpleado;
import co.com.sofka.libreriaDang.Tienda.value.IdFactura;

public class IdEmpleadoAgregado extends DomainEvent {
    private final IdFactura idFactura;
    private final IdEmpleado idEmpleado;

    public IdEmpleadoAgregado(IdFactura idFactura, IdEmpleado idEmpleado) {
        super("sofka.tienda.idempleadoagregado");
        this.idFactura = idFactura;
        this.idEmpleado = idEmpleado;
    }

    public IdFactura getIdFactura() {
        return idFactura;
    }

    public IdEmpleado getIdEmpleado() {
        return idEmpleado;
    }
}
