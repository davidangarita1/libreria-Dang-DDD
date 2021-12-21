package co.com.sofka.libreriaDang.Empleado.value;

import co.com.sofka.domain.generic.Identity;

public class IdGerente extends Identity {

    public IdGerente(){}

    private IdGerente(String id) {
        super(id);
    }

    public static IdGerente of(String id){
        return new IdGerente(id);
    }
}
