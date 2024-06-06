import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readCSV {
    public static void pr(String nombre, String artista, double duracion){
        // tu funcion
        System.out.printf("Nombre: %s, Artista: %s, Duracion: %.2f%n", nombre, artista, duracion);
    }
    public static void main(String args[]){
        String ruta = "Ruta de archivo.csv";
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            boolean first = true;
            while ((line = br.readLine()) != null) {
                if (first) {
                    first = false;
                    continue;
                }
                String[] data = line.split("\\|");
                String nombre = data[0];
                String artista = data[1];
                double duracion = Double.parseDouble(data[2]);

                pr(nombre, artista, duracion);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
