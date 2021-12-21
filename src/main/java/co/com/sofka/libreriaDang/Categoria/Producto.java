package co.com.sofka.libreriaDang.Categoria;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.libreriaDang.Categoria.value.Descripcion;
import co.com.sofka.libreriaDang.Categoria.value.IdProducto;
import co.com.sofka.libreriaDang.Categoria.value.Precio;

import java.util.Objects;

public class Producto extends Entity<IdProducto> {

    private Precio precio;
    private Descripcion descripcion;

    public Producto(IdProducto entityId, Precio precio, Descripcion descripcion) {
        super(entityId);
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public void actualizarPrecio(Precio precio){
        this.precio = Objects.requireNonNull(precio);
    }

    public void actualizarDescripcion(Descripcion descripcion){
        this.descripcion = Objects.requireNonNull(descripcion);
    }

    public Precio precio() {
        return precio;
    }

    public Descripcion descripcion() {
        return descripcion;
    }
}
