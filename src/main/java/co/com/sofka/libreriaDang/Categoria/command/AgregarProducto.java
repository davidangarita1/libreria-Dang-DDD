package co.com.sofka.libreriaDang.Categoria.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.libreriaDang.Categoria.value.Descripcion;
import co.com.sofka.libreriaDang.Categoria.value.IdCategoria;
import co.com.sofka.libreriaDang.Categoria.value.IdProducto;
import co.com.sofka.libreriaDang.Categoria.value.Precio;

public class AgregarProducto extends Command {
    private final IdCategoria idCategoria;
    private final IdProducto idProducto;
    private final Precio precio;
    private final Descripcion descripcion;

    public AgregarProducto(IdCategoria idCategoria, IdProducto idProducto, Precio precio, Descripcion descripcion) {
        this.idCategoria = idCategoria;
        this.idProducto = idProducto;
        this.precio = precio;
        this.descripcion = descripcion;
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

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
