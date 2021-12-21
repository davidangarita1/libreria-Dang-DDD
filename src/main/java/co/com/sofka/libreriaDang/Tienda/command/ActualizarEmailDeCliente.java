package co.com.sofka.libreriaDang.Tienda.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.libreriaDang.Tienda.value.Email;
import co.com.sofka.libreriaDang.Tienda.value.IdCliente;
import co.com.sofka.libreriaDang.Tienda.value.IdTienda;

public class ActualizarEmailDeCliente extends Command {
    private final IdTienda idTienda;
    private final IdCliente idCliente;
    private final Email email;

    public ActualizarEmailDeCliente(IdTienda idTienda, IdCliente idCliente, Email email) {
        this.idTienda = idTienda;
        this.idCliente = idCliente;
        this.email = email;
    }

    public IdTienda getIdTienda() {
        return idTienda;
    }

    public IdCliente getIdCliente() {
        return idCliente;
    }

    public Email getEmail() {
        return email;
    }
}
