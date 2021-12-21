package co.com.sofka.libreriaDang.Empleado.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.libreriaDang.Empleado.value.Funcion;
import co.com.sofka.libreriaDang.Empleado.value.IdGerente;
import co.com.sofka.libreriaDang.Tienda.value.IdTienda;

public class ActualizarFuncionDeGerente extends Command {
    private final IdTienda idTienda;
    private final IdGerente idGerente;
    private final Funcion funcion;

    public ActualizarFuncionDeGerente(IdTienda idTienda, IdGerente idGerente, Funcion funcion) {
        this.idTienda = idTienda;
        this.idGerente = idGerente;
        this.funcion = funcion;
    }

    public IdTienda getIdTienda() {
        return idTienda;
    }

    public IdGerente getIdGerente() {
        return idGerente;
    }

    public Funcion getFuncion() {
        return funcion;
    }
}
