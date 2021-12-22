package co.com.sofka.libreriaDang.Empleado.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.libreriaDang.Empleado.value.Funcion;
import co.com.sofka.libreriaDang.Empleado.value.IdEmpleado;
import co.com.sofka.libreriaDang.Empleado.value.IdGerente;

public class CrearGerente extends Command {
    private final IdEmpleado idEmpleado;
    private final IdGerente idGerente;
    private final Funcion funcion;

    public CrearGerente(IdEmpleado idEmpleado, IdGerente idGerente, Funcion funcion) {
        this.idEmpleado = idEmpleado;
        this.idGerente = idGerente;
        this.funcion = funcion;
    }

    public IdEmpleado getIdEmpleado() {
        return idEmpleado;
    }

    public IdGerente getIdGerente() {
        return idGerente;
    }

    public Funcion getFuncion() {
        return funcion;
    }
}
