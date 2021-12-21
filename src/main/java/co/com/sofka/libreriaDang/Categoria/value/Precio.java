package co.com.sofka.libreriaDang.Categoria.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Precio implements ValueObject<Double> {
    private final Double value;

    public Precio(Double value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isNaN()){
            throw new IllegalArgumentException("El precio debe ser numerico");
        }
        if (this.value < 0){
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
    }

    public Double value() {
        return value;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Precio that = (Precio) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
