package co.com.sofka.libreriaDang.Tienda.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.libreriaDang.Empleado.value.IdEmpleado;
import co.com.sofka.libreriaDang.Tienda.value.IdTienda;

public class AgregarIdEmpleado extends Command {
    private final IdTienda idTienda;
    private final IdEmpleado idEmpleado;

    public AgregarIdEmpleado(IdTienda idTienda, IdEmpleado idEmpleado) {
        this.idTienda = idTienda;
        this.idEmpleado = idEmpleado;
    }

    public IdTienda getIdTienda() {
        return idTienda;
    }

    public IdEmpleado getIdEmpleado() {
        return idEmpleado;
    }
}
