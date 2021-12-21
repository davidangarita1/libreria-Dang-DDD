package co.com.sofka.libreriaDang.Categoria;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.libreriaDang.Categoria.event.CategoriaCreada;
import co.com.sofka.libreriaDang.Categoria.value.*;
import co.com.sofka.libreriaDang.Generico.Nombre;

import java.util.Objects;
import java.util.Set;

public class Categoria extends AggregateEvent<IdCategoria> {

    protected Nombre nombre;
    protected Set<Producto> productos;
    protected Set<Servicio> servicios;

    public Categoria(IdCategoria entityId, Nombre nombre) {
        super(entityId);
        appendChange(new CategoriaCreada(nombre)).apply();
    }

    public void agregarProducto(IdProducto entityId, Precio precio, Descripcion descripcion){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(precio);
        Objects.requireNonNull(descripcion);
        appendChange(new ProductoAgregado(entityId, precio, descripcion)).apply();
    };

    public void agregarServicio(IdServicio entityId, Precio precio, Descripcion descripcion){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(precio);
        Objects.requireNonNull(descripcion);
        appendChange(new ServicioCreado(entityId, precio, descripcion)).apply();
    };

    public void actualizarNombre(Nombre nombre){
        appendChange(new NombreActualizado(nombre)).apply();
    };

    public void actualizarDescripcionDeProducto(IdProducto entityId, Descripcion descripcion){
        appendChange(new DescripcionDeProductoActualizado(entityId, descripcion)).apply();
    };

    public void actualizarDescripcionDeServicio(IdServicio entityId, Descripcion descripcion){
        appendChange(new DescripcionDeServicioActualizado(entityId, descripcion)).apply();
    };

    public void actualizarPrecioDeProducto(IdProducto entityId, Precio precio){
        appendChange(new PrecioDeProductoActualizado(entityId, precio)).apply();
    };

    public void actualizarPrecioDeServicio(IdServicio entityId, Precio precio){
        appendChange(new PrecioDeServicioActualizado(entityId, precio)).apply();
    };


}
