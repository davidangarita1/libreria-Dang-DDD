package co.com.sofka.libreriaDang.Empleado.value;

import co.com.sofka.domain.generic.Identity;

public class IdCajero extends Identity {

    public IdCajero(){}

    private IdCajero(String id) {
        super(id);
    }

    public static IdCajero of(String id){
        return new IdCajero(id);
    }

}
