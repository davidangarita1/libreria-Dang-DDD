package co.com.sofka.libreriaDang.Tienda.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.libreriaDang.Empleado.value.IdVendedor;
import co.com.sofka.libreriaDang.Tienda.value.Detalle;
import co.com.sofka.libreriaDang.Tienda.value.IdCliente;
import co.com.sofka.libreriaDang.Tienda.value.IdFactura;

public class FacturaAgregada  extends DomainEvent {
    private final IdFactura idFactura;
    private final IdVendedor idVendedor;
    private final IdCliente idCliente;
    private final Detalle detalle;

    public FacturaAgregada(IdFactura idFactura, IdVendedor idVendedor, IdCliente idCliente, Detalle detalle) {
        super("sofka.tienda.facturacreada");
        this.idFactura = idFactura;
        this.idVendedor = idVendedor;
        this.idCliente = idCliente;
        this.detalle = detalle;
    }

    public IdFactura getIdFactura() {
        return idFactura;
    }

    public IdVendedor getIdVendedor() {
        return idVendedor;
    }

    public IdCliente getIdCliente() {
        return idCliente;
    }

    public Detalle getDetalle() {
        return detalle;
    }
}
