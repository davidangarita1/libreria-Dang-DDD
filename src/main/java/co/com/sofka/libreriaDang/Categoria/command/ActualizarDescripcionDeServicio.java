package co.com.sofka.libreriaDang.Categoria.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.libreriaDang.Categoria.value.Descripcion;
import co.com.sofka.libreriaDang.Categoria.value.IdCategoria;
import co.com.sofka.libreriaDang.Categoria.value.IdServicio;

public class ActualizarDescripcionDeServicio extends Command {
    private final IdCategoria idCategoria;
    private final IdServicio idServicio;
    private final Descripcion descripcion;

    public ActualizarDescripcionDeServicio(IdCategoria idCategoria, IdServicio idServicio, Descripcion descripcion) {
        this.idCategoria = idCategoria;
        this.idServicio = idServicio;
        this.descripcion = descripcion;
    }

    public IdCategoria getIdCategoria() {
        return idCategoria;
    }

    public IdServicio getIdServicio() {
        return idServicio;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
