package co.com.sofka.libreriaDang.Tienda.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.libreriaDang.Tienda.value.Detalle;
import co.com.sofka.libreriaDang.Tienda.value.IdFactura;
import co.com.sofka.libreriaDang.Tienda.value.IdTienda;

public class ActualizarDetalleDeFactura extends Command {
    private final IdTienda idTienda;
    private final IdFactura idFactura;
    private final Detalle detalle;

    public ActualizarDetalleDeFactura(IdTienda idTienda, IdFactura idFactura, Detalle detalle) {
        this.idTienda = idTienda;
        this.idFactura = idFactura;
        this.detalle = detalle;
    }

    public IdTienda getIdTienda() {
        return idTienda;
    }

    public IdFactura getIdFactura() {
        return idFactura;
    }

    public Detalle getDetalle() {
        return detalle;
    }
}
