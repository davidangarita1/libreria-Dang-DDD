package co.com.sofka.libreriaDang.Empleado.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.libreriaDang.Empleado.value.Funcion;
import co.com.sofka.libreriaDang.Empleado.value.IdVendedor;
import co.com.sofka.libreriaDang.Tienda.value.IdTienda;

public class AgregarVendedor extends Command {
    private final IdTienda idTienda;
    private final IdVendedor idVendedor;
    private final Funcion funcion;

    public AgregarVendedor(IdTienda idTienda, IdVendedor idVendedor, Funcion funcion) {
        this.idTienda = idTienda;
        this.idVendedor = idVendedor;
        this.funcion = funcion;
    }

    public IdTienda getIdTienda() {
        return idTienda;
    }

    public IdVendedor getIdVendedor() {
        return idVendedor;
    }

    public Funcion getFuncion() {
        return funcion;
    }
}
