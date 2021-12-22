package co.com.sofka.libreriaDang.Tienda;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.libreriaDang.Categoria.event.NombreActualizado;
import co.com.sofka.libreriaDang.Categoria.value.IdCategoria;
import co.com.sofka.libreriaDang.Empleado.value.IdEmpleado;
import co.com.sofka.libreriaDang.Empleado.value.IdVendedor;
import co.com.sofka.libreriaDang.Generico.Nombre;
import co.com.sofka.libreriaDang.Tienda.event.*;
import co.com.sofka.libreriaDang.Tienda.value.*;

import java.util.List;
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

    private Tienda(IdTienda idTienda){
        super(idTienda);
        subscribe(new TiendaChange(this));
    }

    public static Tienda from(IdTienda idTienda, List<DomainEvent> events){
        var tienda = new Tienda(idTienda);
        events.forEach(tienda::applyEvent);
        return tienda;
    }

    public void agregarFactura(IdFactura idFactura, IdVendedor idVendedor, IdCliente idCliente, Detalle detalle){
        Objects.requireNonNull(idFactura);
        Objects.requireNonNull(idVendedor);
        Objects.requireNonNull(idCliente);
        Objects.requireNonNull(detalle);
        appendChange(new FacturaAgregada(idFactura, idVendedor, idCliente, detalle)).apply();
    }

    public void agregarIdCategoria(IdFactura idFactura, IdCategoria idCategoria){
        Objects.requireNonNull(idCategoria);
        appendChange(new IdCategoriaAgregada(idFactura, idCategoria)).apply();
    }

    public void agregarCliente(IdCliente idCliente, Nombre nombre, Email email){
        Objects.requireNonNull(idCliente);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(email);
        appendChange(new ClienteAgregado(idCliente, nombre, email)).apply();
    }

    public void agregarIdEmpleado(IdFactura idFactura, IdEmpleado idEmpleado){
        Objects.requireNonNull(idEmpleado);
        appendChange(new IdEmpleadoAgregado(idFactura, idEmpleado)).apply();
    }

    public void actualizarEmailCliente(IdCliente idCliente, Email email){
        appendChange(new EmailDeClienteActualizado(idCliente, email)).apply();
    }

    public void actualizarNombreCliente(IdCliente idCliente, Nombre nombre){
        appendChange(new NombreDeClienteActualizado(idCliente, nombre)).apply();
    }

    public void agregarDetalleFactura(IdFactura idFactura, Detalle detalle){
        Objects.requireNonNull(idFactura);
        Objects.requireNonNull(detalle);
        appendChange(new DetalleDeFacturaAgregado(idFactura, detalle)).apply();
    }

    public void actualizarNombre(Nombre nombre){
        appendChange(new NombreActualizado(nombre)).apply();
    }

    public Optional<Cliente> getClientePorId(IdCliente idCliente){
        return clientes
                .stream()
                .filter(cliente -> cliente.identity().equals(idCliente)).findFirst();
    }

    public Optional<IdCategoria> getIdCategoriaPorId(IdCategoria idCategoria){
        return idCategorias
                .stream().filter(categoria -> categoria.equals(idCategoria)).findFirst();
    }

    public Optional<IdEmpleado> getIdEmpleadoPorId(IdEmpleado idEmpleado){
        return idEmpleados
                .stream().filter(empleado -> empleado.equals(idEmpleado)).findFirst();
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
