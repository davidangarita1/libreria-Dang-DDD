package co.com.sofka.libreriaDang.Categoria.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.libreriaDang.Categoria.value.Descripcion;
import co.com.sofka.libreriaDang.Categoria.value.IdCategoria;
import co.com.sofka.libreriaDang.Categoria.value.IdServicio;
import co.com.sofka.libreriaDang.Categoria.value.Precio;

public class AgregarServicio extends Command {
    private final IdCategoria idCategoria;
    private final IdServicio idServicio;
    private final Precio precio;
    private final Descripcion descripcion;

    public AgregarServicio(IdCategoria idCategoria, IdServicio idServicio, Precio precio, Descripcion descripcion) {
        this.idCategoria = idCategoria;
        this.idServicio = idServicio;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public IdCategoria getIdCategoria() {
        return idCategoria;
    }

    public IdServicio getIdServicio() {
        return idServicio;
    }

    public Precio getPrecio() {
        return precio;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
