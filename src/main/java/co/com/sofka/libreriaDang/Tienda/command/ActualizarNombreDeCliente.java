package co.com.sofka.libreriaDang.Tienda.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.libreriaDang.Generico.Nombre;
import co.com.sofka.libreriaDang.Tienda.value.IdCliente;
import co.com.sofka.libreriaDang.Tienda.value.IdTienda;

public class ActualizarNombreDeCliente extends Command {
    private final IdTienda idTienda;
    private final IdCliente idCliente;
    private final Nombre nombre;

    public ActualizarNombreDeCliente(IdTienda idTienda, IdCliente idCliente, Nombre nombre) {
        this.idTienda = idTienda;
        this.idCliente = idCliente;
        this.nombre = nombre;
    }

    public IdTienda getIdTienda() {
        return idTienda;
    }

    public IdCliente getIdCliente() {
        return idCliente;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
