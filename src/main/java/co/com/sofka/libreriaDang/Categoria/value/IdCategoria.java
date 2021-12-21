package co.com.sofka.libreriaDang.Categoria.value;

import co.com.sofka.domain.generic.Identity;

public class IdCategoria extends Identity {

    public IdCategoria(){}

    private IdCategoria(String id) {
        super(id);
    }

    public static IdCategoria of(String id){
        return new IdCategoria(id);
    }
}
