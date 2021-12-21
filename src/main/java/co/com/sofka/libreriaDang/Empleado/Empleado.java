package co.com.sofka.libreriaDang.Empleado;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.libreriaDang.Categoria.event.NombreActualizado;
import co.com.sofka.libreriaDang.Empleado.event.*;
import co.com.sofka.libreriaDang.Empleado.value.*;
import co.com.sofka.libreriaDang.Generico.Nombre;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Empleado extends AggregateEvent<IdEmpleado> {
    protected Nombre nombre;
    protected Gerente gerente;
    protected Set<Cajero> cajeros;
    protected Set<Vendedor> vendedores;

    public Empleado(IdEmpleado entityId, Nombre nombre) {
        super(entityId);
        appendChange(new EmpleadoCreado(nombre)).apply();
    }

    public void agregarGerente(IdGerente idGerente, Funcion funcion){
        Objects.requireNonNull(idGerente);
        Objects.requireNonNull(funcion);
        appendChange(new GerenteCreado(idGerente, funcion)).apply();
    }

    public void agregarCajero(IdCajero idCajero, Funcion funcion){
        Objects.requireNonNull(idCajero);
        Objects.requireNonNull(funcion);
        appendChange(new CajeroCreado(idCajero, funcion)).apply();
    }

    public void agregarVendedor(IdVendedor idVendedor, Funcion funcion){
        Objects.requireNonNull(idVendedor);
        Objects.requireNonNull(funcion);
        appendChange(new VendedorCreado(idVendedor, funcion)).apply();
    }

    public void actualizarGerente(IdGerente idGerente, Funcion funcion){
        appendChange(new GerenteActualizado(idGerente, funcion)).apply();
    }

    public void actualizarNombre(Nombre nombre){
        appendChange(new NombreActualizado(nombre)).apply();
    };

    public void actualizarFuncionDeVendedor(IdVendedor idVendedor, Funcion funcion){
        appendChange(new FuncionDeVendedorActualizado(idVendedor, funcion)).apply();
    };

    public void actualizarFuncionDeCajero(IdCajero idCajero, Funcion funcion){
        appendChange(new FuncionDeCajeroActualizado(idCajero, funcion)).apply();
    };

    public void actualziarFuncionDeGerente(IdGerente idGerente, Funcion funcion){
        appendChange(new FuncionDeGerenteActualizado(idGerente, funcion)).apply();
    };

    public Optional<Cajero> getCajeroPorId(IdCajero idCajero){
        return cajeros
                .stream()
                .filter(cajero -> cajero.identity().equals(idCajero)).findFirst();
    }

    public Optional<Vendedor> getVendedorPorId(IdVendedor idVendedor){
        return vendedores
                .stream()
                .filter(vendedor -> vendedor.identity().equals(idVendedor)).findFirst();
    }

    public Nombre nombre() {
        return nombre;
    }

    public Gerente gerente() {
        return gerente;
    }

    public Set<Cajero> cajeros() {
        return cajeros;
    }

    public Set<Vendedor> vendedores() {
        return vendedores;
    }
}
