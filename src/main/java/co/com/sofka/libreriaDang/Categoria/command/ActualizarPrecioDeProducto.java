package co.com.sofka.libreriaDang.Categoria.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.libreriaDang.Categoria.value.IdCategoria;
import co.com.sofka.libreriaDang.Categoria.value.IdProducto;
import co.com.sofka.libreriaDang.Categoria.value.Precio;

public class ActualizarPrecioDeProducto extends Command {
    private final IdCategoria idCategoria;
    private final IdProducto idProducto;
    private final Precio precio;

    public ActualizarPrecioDeProducto(IdCategoria idCategoria, IdProducto idProducto, Precio precio) {
        this.idCategoria = idCategoria;
        this.idProducto = idProducto;
        this.precio = precio;
    }

    public IdCategoria getIdCategoria() {
        return idCategoria;
    }

    public IdProducto getIdProducto() {
        return idProducto;
    }

    public Precio getPrecio() {
        return precio;
    }
}
