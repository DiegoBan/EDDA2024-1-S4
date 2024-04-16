import java.util.LinkedList;
import java.util.Queue;

public class ColaBanco {
    private Queue<String> cola;

    public ColaBanco() {
        cola = new LinkedList<>();
    }

    public void agregarCliente(String cliente) {
        cola.add(cliente);
        System.out.println(cliente + " se ha agregado a la cola.");
    }

    public void atenderCliente() {
        if (!cola.isEmpty()) {
            String clienteAtendido = cola.poll();
            System.out.println("Atendiendo a " + clienteAtendido);
        } else {
            System.out.println("No hay clientes en la cola para atender.");
        }
    }

    public boolean colaVacia() {
        return cola.isEmpty();
    }

    public static void main(String[] args) {
        ColaBanco colaBanco = new ColaBanco();
        colaBanco.agregarCliente("Cliente 1");
        colaBanco.agregarCliente("Cliente 2");
        colaBanco.agregarCliente("Cliente 3");

        while (!colaBanco.colaVacia()) {
            colaBanco.atenderCliente();
        }

        colaBanco.atenderCliente(); // Intentando atender un cliente cuando la cola está vacía
    }
}
