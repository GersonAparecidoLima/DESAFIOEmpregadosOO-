package entities;

public class Address {
    // Atributos privados
    private String email;
    private String phone;

    // Construtor
    public Address(String email, String phone) {
        this.email = email;
        this.phone = phone;
    }

    // Método getter para o email
    public String getEmail() {
        return email;
    }

    // Método setter para o email
    public void setEmail(String email) {
        this.email = email;
    }

    // Método getter para o telefone
    public String getPhone() {
        return phone;
    }

    // Método setter para o telefone
    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Método toString para representação da classe
    @Override
    public String toString() {
        return "Address{" +
                "email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
