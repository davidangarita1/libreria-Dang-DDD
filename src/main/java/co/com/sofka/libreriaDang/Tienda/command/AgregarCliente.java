package co.com.sofka.libreriaDang.Tienda.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.libreriaDang.Generico.Nombre;
import co.com.sofka.libreriaDang.Tienda.value.Email;
import co.com.sofka.libreriaDang.Tienda.value.IdCliente;
import co.com.sofka.libreriaDang.Tienda.value.IdTienda;

public class AgregarCliente extends Command {
    private final IdTienda idTienda;
    private final IdCliente idCliente;
    private final Nombre nombre;
    private final Email email;

    public AgregarCliente(IdTienda idTienda, IdCliente idCliente, Nombre nombre, Email email) {
        this.idTienda = idTienda;
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.email = email;
    }

    public IdTienda getIdTienda() {
        return idTienda;
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
