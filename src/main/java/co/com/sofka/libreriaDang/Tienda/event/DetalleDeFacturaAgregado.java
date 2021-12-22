package co.com.sofka.libreriaDang.Tienda.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.libreriaDang.Tienda.value.Detalle;
import co.com.sofka.libreriaDang.Tienda.value.IdFactura;

public class DetalleDeFacturaAgregado extends DomainEvent {
    private final IdFactura idFactura;
    private final Detalle detalle;

    public DetalleDeFacturaAgregado(IdFactura idFactura, Detalle detalle) {
        super("sofka.tienda.detalledefacturaagregado");
        this.idFactura = idFactura;
        this.detalle = detalle;
    }

    public IdFactura getIdFactura() {
        return idFactura;
    }

    public Detalle getDetalle() {
        return detalle;
    }
}
