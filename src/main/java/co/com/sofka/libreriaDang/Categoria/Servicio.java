package co.com.sofka.libreriaDang.Categoria;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.libreriaDang.Categoria.value.Descripcion;
import co.com.sofka.libreriaDang.Categoria.value.IdServicio;
import co.com.sofka.libreriaDang.Categoria.value.Precio;

public class Servicio extends Entity<IdServicio> {

    private final Precio precio;
    private final Descripcion descripcion;

    public Servicio(IdServicio entityId, Precio precio, Descripcion descripcion) {
        super(entityId);
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public Precio precio() {
        return precio;
    }

    public Descripcion descripcion() {
        return descripcion;
    }
}
