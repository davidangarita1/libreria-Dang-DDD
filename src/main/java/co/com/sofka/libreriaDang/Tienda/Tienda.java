package co.com.sofka.libreriaDang.Tienda;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.libreriaDang.Categoria.value.IdCategoria;
import co.com.sofka.libreriaDang.Empleado.value.IdEmpleado;
import co.com.sofka.libreriaDang.Empleado.value.IdVendedor;
import co.com.sofka.libreriaDang.Generico.Nombre;
import co.com.sofka.libreriaDang.Tienda.event.TiendaCreada;
import co.com.sofka.libreriaDang.Tienda.value.*;

import java.util.Objects;
import java.util.Optional;
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

    public void agregarFactura(IdFactura idFactura, IdVendedor idVendedor, IdCliente idCliente, Detalle detalle){
        Objects.requireNonNull(idFactura);
        Objects.requireNonNull(idVendedor);
        Objects.requireNonNull(idCliente);
        Objects.requireNonNull(detalle);
        appendChange(new FacturaCreada(idFactura, idVendedor, idCliente, detalle)).apply();
    }

    public void agregarIdCategoria(IdCategoria idCategoria){
        Objects.requireNonNull(idCategoria);
        appendChange(new IdCategoriaAgregada(idCategoria)).apply();
    }

    public void agregarCliente(IdCliente idCliente, Nombre nombre, Email email){
        Objects.requireNonNull(idCliente);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(email);
        appendChange(new ClienteCreado(idCliente, nombre, email)).apply();
    }

    public void agregarIdEmpleado(IdEmpleado idEmpleado){
        Objects.requireNonNull(idEmpleado);
        appendChange(new IdEmpleadoAgregado(idEmpleado)).apply();
    };

    public void actualizarEmailCliente(IdCliente idCliente, Email email){
        appendChange(new EmailDeClienteActualizado(idCliente, email));
    };

    public void actualizarNombreCliente(){};

    public void agregarDetalleFactura(){};

    public void actualizarImporteFactura(){};

    public void actualizarNombre(){};

    public Optional<Cliente> getClientePorId(IdCliente idCliente){
        return clientes
                .stream()
                .filter(cliente -> cliente.identity().equals(idCliente)).findFirst();
    }

    public Optional<Factura> getFacturaPorId(IdFactura idFactura){
        return  facturas
                .stream()
                .filter(factura -> factura.identity().equals(idFactura)).findFirst();
    }

    public Nombre nombre() {
        return nombre;
    }

    public Set<IdCategoria> idCategorias() {
        return idCategorias;
    }

    public Set<IdEmpleado> idEmpleados() {
        return idEmpleados;
    }

    public Set<Cliente> clientes() {
        return clientes;
    }

    public Set<Factura> facturas() {
        return facturas;
    }
}
