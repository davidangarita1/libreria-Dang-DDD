package co.com.sofka.libreriaDang.Categoria;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.libreriaDang.Categoria.event.CategoriaCreada;

public class CategoriaChange extends EventChange {
    public CategoriaChange(Categoria categoria) {

        apply((CategoriaCreada event) -> {
            categoria.nombre = event.getNombre();
        });
    }
}
