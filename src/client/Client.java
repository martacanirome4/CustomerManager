package client;

public class Client {
    // constructor con atributos dni, nombre y apellido
    public Client(String dni, String name, String surname) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
    }

    // getter de
    public String getDni() {
        return dni;
    }

    // setter
    public void setDni(String dni) {
        this.dni = dni;
    }

}