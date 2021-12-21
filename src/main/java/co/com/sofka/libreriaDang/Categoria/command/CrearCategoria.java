package co.com.sofka.libreriaDang.Categoria.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.libreriaDang.Categoria.value.IdCategoria;
import co.com.sofka.libreriaDang.Generico.Nombre;

public class CrearCategoria extends Command {
    private final IdCategoria idCategoria;
    private final Nombre nombre;

    public CrearCategoria(IdCategoria idCategoria, Nombre nombre) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
    }

    public IdCategoria getIdCategoria() {
        return idCategoria;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
