package co.com.sofka.libreriaDang.Categoria;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.libreriaDang.Categoria.event.*;
import co.com.sofka.libreriaDang.Categoria.value.*;
import co.com.sofka.libreriaDang.Generico.Nombre;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Categoria extends AggregateEvent<IdCategoria> {

    protected Nombre nombre;
    protected Set<Producto> productos;
    protected Set<Servicio> servicios;

    public Categoria(IdCategoria entityId, Nombre nombre) {
        super(entityId);
        appendChange(new CategoriaCreada(nombre)).apply();
    }

    private Categoria(IdCategoria idCategoria){
        super(idCategoria);
        subscribe(new CategoriaChange(this));
    }

    public static Categoria from(IdCategoria idCategoria, List<DomainEvent> events){
        var categoria = new Categoria(idCategoria);
        events.forEach(categoria::applyEvent);
        return categoria;
    }

    public void agregarProducto(IdProducto idProducto, Precio precio, Descripcion descripcion){
        Objects.requireNonNull(idProducto);
        Objects.requireNonNull(precio);
        Objects.requireNonNull(descripcion);
        appendChange(new ProductoAgregado(idProducto, precio, descripcion)).apply();
    };

    public void agregarServicio(IdServicio idServicio, Precio precio, Descripcion descripcion){
        Objects.requireNonNull(idServicio);
        Objects.requireNonNull(precio);
        Objects.requireNonNull(descripcion);
        appendChange(new ServicioAgregado(idServicio, precio, descripcion)).apply();
    };

    public void actualizarNombre(Nombre nombre){
        appendChange(new NombreActualizado(nombre)).apply();
    };

    public void actualizarDescripcionDeProducto(IdProducto idProducto, Descripcion descripcion){
        appendChange(new DescripcionDeProductoActualizado(idProducto, descripcion)).apply();
    };

    public void actualizarDescripcionDeServicio(IdServicio idServicio, Descripcion descripcion){
        appendChange(new DescripcionDeServicioActualizado(idServicio, descripcion)).apply();
    };

    public void actualizarPrecioDeProducto(IdProducto idProducto, Precio precio){
        appendChange(new PrecioDeProductoActualizado(idProducto, precio)).apply();
    };

    public void actualizarPrecioDeServicio(IdServicio idServicio, Precio precio){
        appendChange(new PrecioDeServicioActualizado(idServicio, precio)).apply();
    };

    protected Optional<Producto> getProductoPorId(IdProducto idProducto){
        return productos
                .stream()
                .filter(producto -> producto.identity().equals(idProducto)).findFirst();
    }

    protected Optional<Servicio> getServicioPorId(IdServicio idServicio){
        return servicios
                .stream()
                .filter(servicio -> servicio.identity().equals(idServicio)).findFirst();
    }

    public Nombre nombre() {
        return nombre;
    }

    public Set<Producto> productos() {
        return productos;
    }

    public Set<Servicio> servicios() {
        return servicios;
    }
}
