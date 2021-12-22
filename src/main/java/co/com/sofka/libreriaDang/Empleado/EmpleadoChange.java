package co.com.sofka.libreriaDang.Empleado;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.libreriaDang.Empleado.event.*;
import co.com.sofka.libreriaDang.Generico.Nombre;

import java.util.HashSet;
import java.util.Set;

public class EmpleadoChange extends EventChange {
    public EmpleadoChange(Empleado empleado) {

        apply((EmpleadoCreado event) -> {
            empleado.nombre = event.getNombre();
            empleado.gerente = event.getGerente();
            empleado.cajeros = new HashSet<>();
            empleado.vendedores = new HashSet<>();
        });

        apply((CajeroAgregado event) -> {
            var numCajeros = empleado.cajeros().size();
            if (numCajeros == 2) {
                throw  new IllegalArgumentException("No puedes agregar mas cajeros, solo puedes tener hasta 2 de ellos");
            }
            empleado.cajeros.add(new Cajero(
                    event.getIdCajero(),
                    event.getFuncion()
            ));
        });

        apply((VendedorAgregado event) -> {
            var numVendedores = empleado.vendedores.size();
            if (numVendedores == 5) {
                throw  new IllegalArgumentException("No puedes agregar mas vendedores, solo puedes tener hasta 5 de ellos");
            }
            empleado.vendedores.add(new Vendedor(
                    event.getIdVendedor(),
                    event.getFuncion()
            ));
        });

        apply((FuncionDeCajeroActualizado event) -> {
            var cajero = empleado.getCajeroPorId(event.getIdCajero())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra la función del cajero"));
            cajero.actualizarFuncion(event.getFuncion());
        });

        apply((FuncionDeGerenteActualizado event) -> {
            empleado.gerente.actualizarFuncion(event.getFuncion());
        });

        apply((FuncionDeVendedorActualizado event) -> {
            var vendedor = empleado.getVendedorPorId(event.getIdVendedor())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra la función del vendedor"));
            vendedor.actualizarFuncion(event.getFuncion());
        });

        apply((GerenteActualizado event) -> {
            empleado.actualizarGerente(event.getIdGerente(), event.getFuncion());
        });

        apply((GerenteCreado event) -> {
            empleado.crearGerente(event.getIdGerente(), event.getFuncion());
        });

        apply((NombreActualizado event) -> {
            empleado.nombre = event.getNombre();
        });


    }
}
