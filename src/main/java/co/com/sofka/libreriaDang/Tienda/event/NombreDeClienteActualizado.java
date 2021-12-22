package co.com.sofka.libreriaDang.Tienda.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.libreriaDang.Generico.Nombre;
import co.com.sofka.libreriaDang.Tienda.value.IdCliente;

public class NombreDeClienteActualizado extends DomainEvent {
    private final IdCliente idCliente;
    private final Nombre nombre;

    public NombreDeClienteActualizado(IdCliente idCliente, Nombre nombre) {
        super("sofka.tienda.nombredeclienteactualizado");
        this.idCliente = idCliente;
        this.nombre = nombre;
    }

    public IdCliente getIdCliente() {
        return idCliente;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
