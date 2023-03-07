package dominio;

public class Client {

    private String dni;
    private String name;
    private String surname;
    private String manager;

    // constructor con atributos dni, nombre y apellido
    public Client(String dni, String name, String surname, String manager) {

        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.manager = manager;
    }

    // getter de
    public String getDni() {
        return dni;
    }

    // setter
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String toString() {
        return "Client [dni=" + dni + ", name=" + name + ", surname=" + surname + ", manager=" + manager + "]";
    }
}













