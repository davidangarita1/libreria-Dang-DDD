package co.com.sofka.libreriaDang.Categoria.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.libreriaDang.Categoria.value.Descripcion;
import co.com.sofka.libreriaDang.Categoria.value.IdCategoria;
import co.com.sofka.libreriaDang.Categoria.value.IdProducto;

public class ActualizarDescripcionDeProducto extends Command {
    private final IdCategoria idCategoria;
    private final IdProducto idProducto;
    private final Descripcion descripcion;

    public ActualizarDescripcionDeProducto(IdCategoria idCategoria, IdProducto idProducto, Descripcion descripcion) {
        this.idCategoria = idCategoria;
        this.idProducto = idProducto;
        this.descripcion = descripcion;
    }

    public IdCategoria getIdCategoria() {
        return idCategoria;
    }

    public IdProducto getIdProducto() {
        return idProducto;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
