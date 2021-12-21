package co.com.sofka.libreriaDang.Categoria.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.libreriaDang.Categoria.value.IdCategoria;
import co.com.sofka.libreriaDang.Categoria.value.IdServicio;
import co.com.sofka.libreriaDang.Categoria.value.Precio;

public class ActualizarPrecioDeServicio extends Command {
    private final IdCategoria idCategoria;
    private final IdServicio idServicio;
    private final Precio precio;

    public ActualizarPrecioDeServicio(IdCategoria idCategoria, IdServicio idServicio, Precio precio) {
        this.idCategoria = idCategoria;
        this.idServicio = idServicio;
        this.precio = precio;
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
}
