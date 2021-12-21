package co.com.sofka.libreriaDang.Tienda.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.libreriaDang.Empleado.value.IdVendedor;
import co.com.sofka.libreriaDang.Tienda.value.Detalle;
import co.com.sofka.libreriaDang.Tienda.value.IdCliente;
import co.com.sofka.libreriaDang.Tienda.value.IdFactura;
import co.com.sofka.libreriaDang.Tienda.value.IdTienda;

public class AgregarFactura extends Command {
    private final IdTienda idTienda;
    private final IdFactura entityId;
    private final IdVendedor idVendedor;
    private final IdCliente idCliente;
    private final Detalle detalle;

    public AgregarFactura(IdTienda idTienda, IdFactura entityId, IdVendedor idVendedor, IdCliente idCliente, Detalle detalle) {
        this.idTienda = idTienda;
        this.entityId = entityId;
        this.idVendedor = idVendedor;
        this.idCliente = idCliente;
        this.detalle = detalle;
    }

    public IdTienda getIdTienda() {
        return idTienda;
    }

    public IdFactura getEntityId() {
        return entityId;
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
