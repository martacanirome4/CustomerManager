package dominio;
imprt java.util.*;

public class Agenda {

    private ArrayList<Client> clients;

    // se pueden definir tantos constructores como se quiera, pero que difieran en numero/tipo de parametros
    public Agenda(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public Agenda() {
        this.clients = new ArrayList<Client>();
    }

    public Client filtrarGestor(String manager) {}

    public Client filtrarDNI(String dni) {}

    public añadirCliente(client) {}

    public modificarCliente(String dni) {}

    public Client listarClientes() {}

    public Client listarCliente() {}

}