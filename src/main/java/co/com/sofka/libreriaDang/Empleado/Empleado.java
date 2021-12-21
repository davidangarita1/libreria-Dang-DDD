package co.com.sofka.libreriaDang.Empleado;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.libreriaDang.Empleado.event.EmpleadoCreado;
import co.com.sofka.libreriaDang.Empleado.value.IdEmpleado;
import co.com.sofka.libreriaDang.Generico.Nombre;

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

}
