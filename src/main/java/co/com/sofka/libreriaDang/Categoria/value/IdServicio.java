package co.com.sofka.libreriaDang.Categoria.value;

import co.com.sofka.domain.generic.Identity;

public class IdServicio extends Identity {

    public IdServicio(){}

    private IdServicio(String id) {
        super(id);
    }

    public static IdServicio of(String id){
        return new IdServicio(id);
    }
}
