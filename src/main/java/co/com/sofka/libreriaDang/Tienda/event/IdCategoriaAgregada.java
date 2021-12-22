package co.com.sofka.libreriaDang.Tienda.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.libreriaDang.Categoria.value.IdCategoria;
import co.com.sofka.libreriaDang.Tienda.value.IdFactura;

public class IdCategoriaAgregada extends DomainEvent {
    private final IdFactura idFactura;
    private final IdCategoria idCategoria;

    public IdCategoriaAgregada(IdFactura idFactura, IdCategoria idCategoria) {
        super("sofka.tienda.idcategoriaagregada");
        this.idFactura = idFactura;
        this.idCategoria = idCategoria;
    }

    public IdFactura getIdFactura() {
        return idFactura;
    }

    public IdCategoria getIdCategoria() {
        return idCategoria;
    }
}
