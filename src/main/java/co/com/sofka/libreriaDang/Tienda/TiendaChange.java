package co.com.sofka.libreriaDang.Tienda;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.libreriaDang.Tienda.event.*;

import java.util.HashSet;

public class TiendaChange extends EventChange {
    public TiendaChange(Tienda tienda) {

        apply((TiendaCreada event) -> {
            tienda.nombre = event.getNombre();
            tienda.idCategorias = new HashSet<>();
            tienda.idEmpleados = new HashSet<>();
            tienda.clientes = new HashSet<>();
            tienda.facturas = new HashSet<>();
        });

        apply((ClienteAgregado event) -> {
            var numClientes = tienda.clientes().size();
            tienda.clientes.add(new Cliente(
                    event.getIdCliente(),
                    event.getNombre(),
                    event.getEmail()
            ));
        });

        apply((DetalleDeFacturaAgregado event) -> {
            var factura = tienda.getFacturaPorId(event.getIdFactura())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra el detalle de la factura"));
            factura.actualizarDetalle(event.getDetalle());
        });

        apply((EmailDeClienteActualizado event) -> {
            var cliente = tienda.getClientePorId(event.getIdCliente())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra el email del cliente"));
            cliente.actualizarEmail(event.getEmail());
        });

        apply((FacturaAgregada event) -> {
            var numFacturas = tienda.facturas().size();
            tienda.facturas.add(new Factura(
                    event.getIdFactura(),
                    event.getIdVendedor(),
                    event.getIdCliente(),
                    event.getDetalle()
            ));
        });

        apply((IdCategoriaAgregada event) -> {
            var numIdCategorias = tienda.getIdCategoriaPorId(event.getIdCategoria())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra el id de la categoria"));
        });

        apply((IdEmpleadoAgregado event) -> {
            var numIdEmpleados = tienda.getIdEmpleadoPorId(event.getIdEmpleado())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra el id del empleado"));
        });

        apply((NombreDeClienteActualizado event) -> {
            var cliente = tienda.getClientePorId(event.getIdCliente())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra el nombre del cliente"));
            cliente.actualizarNombre(event.getNombre());
        });
    }
}
