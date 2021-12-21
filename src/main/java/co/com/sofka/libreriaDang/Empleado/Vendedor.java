package co.com.sofka.libreriaDang.Empleado;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.libreriaDang.Empleado.value.Funcion;
import co.com.sofka.libreriaDang.Empleado.value.IdVendedor;

import java.util.Objects;

public class Vendedor extends Entity<IdVendedor> {

    protected Funcion funcion;

    public Vendedor(IdVendedor entityId, Funcion funcion) {
        super(entityId);
        this.funcion = funcion;
    }

    public void actualizarFuncion(Funcion funcion){
        this.funcion = Objects.requireNonNull(funcion);
    }

    public Funcion funcion() {
        return funcion;
    }
}
