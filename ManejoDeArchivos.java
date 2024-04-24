import java.io.File;       
import java.io.FileWriter;  
import java.io.FileReader;  
import java.io.BufferedReader; 
import java.io.IOException; 
public class ManejoDeArchivos {
    public static void main(String[] args) {
        try {
            
            File miArchivo1 = new File("archivo1.txt");
            if (miArchivo1.createNewFile()) {
                System.out.println("Archivo creado: " + miArchivo1.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }

            
            File miArchivo2 = new File("archivo2.txt");
            if (miArchivo2.createNewFile()) {
                System.out.println("Archivo creado: " + miArchivo2.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }

            
            FileWriter escritor = new FileWriter("archivo1.txt");
            escritor.write("Este es un ejemplo de manejo de archivos en Java.");
            escritor.close();
            System.out.println("Se ha escrito con éxito en el archivo.");

           
            FileReader lector = new FileReader("archivo1.txt");
            BufferedReader lectorBuffer = new BufferedReader(lector);
            String linea;
            while ((linea = lectorBuffer.readLine()) != null) {
                System.out.println(linea);
            }
            lector.close();

            
            if (miArchivo2.delete()) {
                System.out.println("El archivo " + miArchivo2.getName() + " ha sido eliminado.");
            } else {
                System.out.println("Error al eliminar el archivo.");
            }

            System.out.println("Existe archivo1.txt: " + miArchivo1.exists());
            System.out.println("Existe archivo2.txt: " + miArchivo2.exists());

        } catch (IOException e) {
            System.out.println("Ocurrió un error.");
            e.printStackTrace();
        }
    }
}
