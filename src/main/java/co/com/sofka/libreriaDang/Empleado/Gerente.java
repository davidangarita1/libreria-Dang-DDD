package co.com.sofka.libreriaDang.Empleado;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.libreriaDang.Empleado.value.Funcion;
import co.com.sofka.libreriaDang.Empleado.value.IdGerente;

import java.util.Objects;

public class Gerente extends Entity<IdGerente> {

    protected Funcion funcion;

    public Gerente(IdGerente entityId, Funcion funcion) {
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
