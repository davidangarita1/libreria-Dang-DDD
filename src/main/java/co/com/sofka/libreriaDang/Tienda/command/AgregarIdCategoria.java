package co.com.sofka.libreriaDang.Tienda.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.libreriaDang.Categoria.value.IdCategoria;
import co.com.sofka.libreriaDang.Tienda.value.IdTienda;

public class AgregarIdCategoria extends Command {
    private final IdTienda idTienda;
    private final IdCategoria idCategoria;

    public AgregarIdCategoria(IdTienda idTienda, IdCategoria idCategoria) {
        this.idTienda = idTienda;
        this.idCategoria = idCategoria;
    }

    public IdTienda getIdTienda() {
        return idTienda;
    }

    public IdCategoria getIdCategoria() {
        return idCategoria;
    }
}
