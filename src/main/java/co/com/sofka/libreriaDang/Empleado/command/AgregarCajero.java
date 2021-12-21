package co.com.sofka.libreriaDang.Empleado.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.libreriaDang.Empleado.value.Funcion;
import co.com.sofka.libreriaDang.Empleado.value.IdCajero;
import co.com.sofka.libreriaDang.Tienda.value.IdTienda;

public class AgregarCajero extends Command {
    private final IdTienda idTienda;
    private final IdCajero idCajero;
    private final Funcion funcion;

    public AgregarCajero(IdTienda idTienda, IdCajero idCajero, Funcion funcion) {
        this.idTienda = idTienda;
        this.idCajero = idCajero;
        this.funcion = funcion;
    }

    public IdTienda getIdTienda() {
        return idTienda;
    }

    public IdCajero getIdCajero() {
        return idCajero;
    }

    public Funcion getFuncion() {
        return funcion;
    }
}
