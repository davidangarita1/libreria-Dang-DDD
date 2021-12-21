package co.com.sofka.libreriaDang.Categoria;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.libreriaDang.Categoria.event.*;

import java.util.HashSet;

public class CategoriaChange extends EventChange {
    public CategoriaChange(Categoria categoria) {

        apply((CategoriaCreada event) -> {
            categoria.nombre = event.getNombre();
            categoria.productos = new HashSet<>();
            categoria.servicios = new HashSet<>();
        });

        apply((DescripcionDeProductoActualizado event) -> {
            var producto = categoria.getProductoPorId(event.getIdProducto())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra la descripción del producto "));
            producto.actualizarDescripcion(event.getDescripcion());
        });

        apply((DescripcionDeServicioActualizado event) -> {
            var servicio = categoria.getServicioPorId(event.getIdServicio())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra la descripción del servicio "));
            servicio.actualizarDescripcion(event.getDescripcion());
        });

        apply((NombreActualizado event) -> {
            categoria.nombre = event.getNombre();
        });

        apply((PrecioDeProductoActualizado event) -> {
            var producto = categoria.getProductoPorId(event.getIdProducto())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra el precio del producto"));
            producto.actualizarPrecio(event.getPrecio());
        });

        apply((PrecioDeServicioActualizado event) -> {
           var servicio = categoria.getServicioPorId(event.getIdServicio())
                   .orElseThrow(() -> new IllegalArgumentException("No se encuentra el precio del servicio"));
           servicio.actualizarPrecio(event.getPrecio());
        });

        apply((ProductoAgregado event) -> {
            var numProductos = categoria.productos().size();
            if (numProductos == 1000) {
                throw  new IllegalArgumentException("No pruedes agregar mas productos, solo puedes tener hasta 1000 de ellos");
            }
            categoria.productos.add(new Producto(
                    event.getIdProducto(),
                    event.getPrecio(),
                    event.getDescripcion()
            ));
        });

        apply((ServicioAgregado event) -> {
            var numServicios = categoria.servicios().size();
            if (numServicios == 10) {
                throw  new IllegalArgumentException("No puedes agregar mas servicios, solo puedes tener hasta 10 de ellos");
            }
            categoria.servicios.add(new Servicio(
                    event.getIdServicio(),
                    event.getPrecio(),
                    event.getDescripcion()
            ));
        });
    }
}
