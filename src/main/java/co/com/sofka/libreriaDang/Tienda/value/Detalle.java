package co.com.sofka.libreriaDang.Tienda.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Detalle implements ValueObject<String> {
    private final String value;

    public Detalle(String value) {
        this.value = Objects.requireNonNull(value);

        if(this.value.isBlank()){
            throw new IllegalArgumentException("El detalle no puede estar vacio");
        }
        if (this.value.length() <= 5){
            throw new IllegalArgumentException("Debe de tener mas de 5 caracteres");
        }
        if (this.value.length() >= 180){
            throw new IllegalArgumentException("Debe ser menor a 180 caracteres");
        }
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Detalle that = (Detalle) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
