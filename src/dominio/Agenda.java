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


    // metodos
    public Agenda filterManager(String manager) {
        return new Agenda(clients.stream().filter(x->x.getManager()).equals(manager)).collect(Collectors.toArrayList::new));
        // toArrayList::new = (x -> new Collector.toArrayList(x))
    }

    public Client filterByDNI(String dni){
       return  clients.stream().
               filter(client -> client.getDNI() == dni).
               getFirst().
               orElse(null);
    }

    public addCLient(client) {
        clients.add(client);
    }

    public modifyClient(String dni) {

    }

    public listClients() {}

    public listClientsInOrder() {}

}
