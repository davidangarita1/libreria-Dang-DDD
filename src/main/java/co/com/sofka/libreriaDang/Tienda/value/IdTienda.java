package co.com.sofka.libreriaDang.Tienda.value;

import co.com.sofka.domain.generic.Identity;

public class IdTienda extends Identity {

    public IdTienda(){}

    private IdTienda(String id){
        super(id);
    }

    public static IdTienda of(String id){
        return new IdTienda(id);
    }
}
