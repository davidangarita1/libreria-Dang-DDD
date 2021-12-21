package co.com.sofka.libreriaDang.Empleado.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.libreriaDang.Empleado.value.IdEmpleado;
import co.com.sofka.libreriaDang.Generico.Nombre;

public class CrearEmpelado extends Command {
    private final IdEmpleado idEmpleado;
    private final Nombre nombre;

    public CrearEmpelado(IdEmpleado idEmpleado, Nombre nombre) {
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
