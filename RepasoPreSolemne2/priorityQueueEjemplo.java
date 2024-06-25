import java.util.PriorityQueue;
import java.util.Comparator;

public class priorityQueueEjemplo {
    public static class Persona {
        String nombre;
        int edad;
        Persona(String nombre, int edad){
            this.nombre = nombre;
            this.edad = edad;
        }
        public String toString(){
            return nombre + " (" + edad + ")";
        }
    }
    public static void main(String[] args){
        // Orden Ascendente
        PriorityQueue<Integer> colaAscendente = new PriorityQueue<>();
        colaAscendente.add(5);
        colaAscendente.add(1);
        colaAscendente.add(3);
        System.out.println("Orden Ascendente: ");
        while(!colaAscendente.isEmpty()){
            System.out.println(colaAscendente.poll());
        }
        System.out.println();

        // Orden Descendente
        PriorityQueue<Integer> colaDescendente = new PriorityQueue<>(Comparator.reverseOrder());
        colaDescendente.add(5);
        colaDescendente.add(1);
        colaDescendente.add(3);
        System.out.println("Orden Descendente: ");
        while(!colaDescendente.isEmpty()){
            System.out.println(colaDescendente.poll());
        }
        System.out.println();

        // Orden por longitud de cadena de texto
        PriorityQueue<String> stringLength = new PriorityQueue<>((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        stringLength.add("Vendedor de Leña");
        stringLength.add("Samurai de Pudahuel");
        stringLength.add("PapiMicky");
        System.out.println("Orden por longitud de cadena de texto: ");
        while(!stringLength.isEmpty()){
            System.out.println(stringLength.poll());
        }
        System.out.println();

        // Orden por un atributo de clase
        PriorityQueue<Persona> colaPersonas = new PriorityQueue<>((p1, p2) -> {
            int edadDif = Integer.compare(p1.edad, p2.edad);
            if(edadDif == 0){
                return p1.nombre.compareTo(p2.nombre);
            }
            return edadDif;
        });
        colaPersonas.add(new Persona("Diego", 20));
        colaPersonas.add(new Persona("Vicente", 21));
        colaPersonas.add(new Persona("Pancho", 20));
        colaPersonas.add(new Persona("Camilo", 40));
        System.out.println("Orden por atributo de clase: ");
        while(!colaPersonas.isEmpty()){
            System.out.println(colaPersonas.poll().toString());
        }
        System.out.println();
    }
}