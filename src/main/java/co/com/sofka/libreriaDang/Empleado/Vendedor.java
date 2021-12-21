package co.com.sofka.libreriaDang.Empleado;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.libreriaDang.Empleado.value.Funcion;
import co.com.sofka.libreriaDang.Empleado.value.IdVendedor;

public class Vendedor extends Entity<IdVendedor> {

    protected final Funcion funcion;

    public Vendedor(IdVendedor entityId, Funcion funcion) {
        super(entityId);
        this.funcion = funcion;
    }

    public Funcion funcion() {
        return funcion;
    }
}
