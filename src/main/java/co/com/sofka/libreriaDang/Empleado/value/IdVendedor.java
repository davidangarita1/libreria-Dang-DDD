package co.com.sofka.libreriaDang.Empleado.value;

import co.com.sofka.domain.generic.Identity;

public class IdVendedor extends Identity {

    public IdVendedor(){}

    private IdVendedor(String id) {
        super(id);
    }

    public static IdVendedor of(String id){
        return new IdVendedor(id);
    }
}
