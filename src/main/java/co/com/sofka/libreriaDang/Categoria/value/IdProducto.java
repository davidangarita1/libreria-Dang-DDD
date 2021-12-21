package co.com.sofka.libreriaDang.Categoria.value;

import co.com.sofka.domain.generic.Identity;

public class IdProducto extends Identity {

    public IdProducto(){}

    private IdProducto(String id) {
        super(id);
    }

    public static IdProducto of(String id){
        return new IdProducto(id);
    }
}
