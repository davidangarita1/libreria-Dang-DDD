package co.com.sofka.libreriaDang.Empleado.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.libreriaDang.Empleado.value.IdEmpleado;
import co.com.sofka.libreriaDang.Generico.Nombre;

public class ActualizarNombre extends Command {
    private final IdEmpleado idEmpleado;
    private final Nombre nombre;

    public ActualizarNombre(IdEmpleado idEmpleado, Nombre nombre) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
    }

    public IdEmpleado getIdEmpleado() {
        return idEmpleado;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
