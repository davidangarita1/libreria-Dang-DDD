package co.com.sofka.libreriaDang.Tienda;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.libreriaDang.Generico.Nombre;
import co.com.sofka.libreriaDang.Tienda.value.Email;
import co.com.sofka.libreriaDang.Tienda.value.IdCliente;

public class Cliente extends Entity<IdCliente> {

    private final Nombre nombre;
    private final Email email;


    public Cliente(IdCliente entityId, Nombre nombre, Email email) {
        super(entityId);
        this.nombre = nombre;
        this.email = email;
    }

    public Nombre nombre() {
        return nombre;
    }

    public Email email() {
        return email;
    }
}
