package co.com.sofka.libreriaDang.Empleado.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.libreriaDang.Empleado.value.Funcion;
import co.com.sofka.libreriaDang.Empleado.value.IdEmpleado;
import co.com.sofka.libreriaDang.Empleado.value.IdVendedor;

public class ActualizarFuncionDeVendedor extends Command {
    private final IdEmpleado idEmpleado;
    private final IdVendedor idVendedor;
    private final Funcion funcion;

    public ActualizarFuncionDeVendedor(IdEmpleado idEmpleado, IdVendedor idVendedor, Funcion funcion) {
        this.idEmpleado = idEmpleado;
        this.idVendedor = idVendedor;
        this.funcion = funcion;
    }

    public IdEmpleado getIdEmpleado() {
        return idEmpleado;
    }

    public IdVendedor getIdVendedor() {
        return idVendedor;
    }

    public Funcion getFuncion() {
        return funcion;
    }
}
