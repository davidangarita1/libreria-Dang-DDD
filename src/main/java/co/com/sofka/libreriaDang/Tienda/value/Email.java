package co.com.sofka.libreriaDang.Tienda.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Email implements ValueObject<String> {
    private final String value;

    public Email(String value) {
        this.value = Objects.requireNonNull(value);
        if (!value.matches("[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)@[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)(\\.[_A-Za-z]{2,})$"));
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El email no puede estar vacio");
        }
        if (this.value.length() >= 80){
            throw new IllegalArgumentException("Debe ser menor a 80 caracteres");
        }
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email that = (Email) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
