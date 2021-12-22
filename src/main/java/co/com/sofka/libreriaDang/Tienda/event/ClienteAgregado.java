package co.com.sofka.libreriaDang.Tienda.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.libreriaDang.Generico.Nombre;
import co.com.sofka.libreriaDang.Tienda.value.Email;
import co.com.sofka.libreriaDang.Tienda.value.IdCliente;

public class ClienteAgregado extends DomainEvent {
    private final IdCliente idCliente;
    private final Nombre nombre;
    private final Email email;

    public ClienteAgregado(IdCliente idCliente, Nombre nombre, Email email) {
        super("sofka.tienda.clienteagregado");
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.email = email;
    }

    public IdCliente getIdCliente() {
        return idCliente;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Email getEmail() {
        return email;
    }
}
