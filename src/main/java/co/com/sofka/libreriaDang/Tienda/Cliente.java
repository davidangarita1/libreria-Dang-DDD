package co.com.sofka.libreriaDang.Tienda;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.libreriaDang.Generico.Nombre;
import co.com.sofka.libreriaDang.Tienda.value.Email;
import co.com.sofka.libreriaDang.Tienda.value.IdCliente;

import java.util.Objects;

public class Cliente extends Entity<IdCliente> {

    private Nombre nombre;
    private Email email;


    public Cliente(IdCliente idCliente, Nombre nombre, Email email) {
        super(idCliente);
        this.nombre = nombre;
        this.email = email;
    }

    public void actualizarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    public void actualizarEmail(Email email){
        this.email = Objects.requireNonNull(email);
    }

    public Nombre nombre() {
        return nombre;
    }

    public Email email() {
        return email;
    }
}
