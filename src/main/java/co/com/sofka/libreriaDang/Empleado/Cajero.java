package co.com.sofka.libreriaDang.Empleado;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.libreriaDang.Empleado.value.Funcion;
import co.com.sofka.libreriaDang.Empleado.value.IdCajero;

import java.util.Objects;

public class Cajero extends Entity<IdCajero> {

    protected Funcion funcion;

    public Cajero(IdCajero entityId, Funcion funcion) {
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
