package co.com.sofka.libreriaDang.Tienda.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.libreriaDang.Tienda.value.Email;
import co.com.sofka.libreriaDang.Tienda.value.IdCliente;

public class EmailDeClienteActualizado extends DomainEvent {
    private final IdCliente idCliente;
    private final Email email;

    public EmailDeClienteActualizado(IdCliente idCliente, Email email) {
        super("sofka.tienda.emaildeclienteactualizado");
        this.idCliente = idCliente;
        this.email = email;
    }

    public IdCliente getIdCliente() {
        return idCliente;
    }

    public Email getEmail() {
        return email;
    }
}
