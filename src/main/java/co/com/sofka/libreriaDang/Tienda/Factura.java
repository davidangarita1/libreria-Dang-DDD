package co.com.sofka.libreriaDang.Tienda;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.libreriaDang.Empleado.value.IdVendedor;
import co.com.sofka.libreriaDang.Tienda.value.Detalle;
import co.com.sofka.libreriaDang.Tienda.value.IdCliente;
import co.com.sofka.libreriaDang.Tienda.value.IdFactura;

import java.util.Objects;

public class Factura extends Entity<IdFactura> {

    private final IdVendedor idVendedor;
    private final IdCliente idCliente;
    private Detalle detalle;

    public Factura(IdFactura entityId, IdVendedor idVendedor, IdCliente idCliente, Detalle detalle) {
        super(entityId);
        this.idVendedor = idVendedor;
        this.idCliente = idCliente;
        this.detalle = detalle;
    }

    public void actualizarDetalle(Detalle detalle){
        this.detalle = Objects.requireNonNull(detalle);
    }

    public IdVendedor idVendedor() {
        return idVendedor;
    }

    public IdCliente idCliente() {
        return idCliente;
    }

    public Detalle detalle() {
        return detalle;
    }
}
