package co.com.sofka.libreriaDang.Tienda;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.libreriaDang.Categoria.value.IdCategoria;
import co.com.sofka.libreriaDang.Empleado.value.IdEmpleado;
import co.com.sofka.libreriaDang.Generico.Nombre;
import co.com.sofka.libreriaDang.Tienda.event.TiendaCreada;
import co.com.sofka.libreriaDang.Tienda.value.IdTienda;

import java.util.Set;

public class Tienda extends AggregateEvent<IdTienda> {
    protected Nombre nombre;
    protected Set<IdCategoria> idCategorias;
    protected Set<IdEmpleado> idEmpleados;
    protected Set<Cliente> clientes;
    protected Set<Factura> facturas;

    public Tienda(IdTienda entityId, Nombre nombre) {
        super(entityId);
        appendChange(new TiendaCreada(nombre)).apply();
    }

}
