package co.com.sofka.libreriaDang.Empleado.value;

import co.com.sofka.domain.generic.Identity;

public class IdEmpleado extends Identity {

    public IdEmpleado(){}

    private IdEmpleado(String id) {
        super(id);
    }

    public static IdEmpleado of(String id){
        return new IdEmpleado(id);
    }
}
