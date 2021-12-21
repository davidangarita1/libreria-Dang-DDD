package co.com.sofka.libreriaDang.Tienda.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.libreriaDang.Generico.Nombre;
import co.com.sofka.libreriaDang.Tienda.value.IdTienda;

public class CrearTienda extends Command {
    private final IdTienda idTienda;
    private final Nombre nombre;

    public CrearTienda(IdTienda idTienda, Nombre nombre) {
        this.idTienda = idTienda;
        this.nombre = nombre;
    }

    public IdTienda getIdTienda() {
        return idTienda;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
