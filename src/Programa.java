import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner texto = new Scanner(new File("persona.txt"));
        texto.useDelimiter("[;\\n]");

        Persona mayor = null;

        while (texto.hasNextInt()){

            int documento = texto.nextInt();
            String nombre = texto.next();
            int edad = texto.nextInt();

            Persona p = new Persona (documento, nombre, edad);

            if (mayor == null || p.getEdad() > mayor.getEdad()){
                mayor = p;
            }
           // System.out.printf("%4d %-20s %3d", p.getDocumento(), p.getNombre(), p.getEdad());
        }

        System.out.println("Persona de mayor edad");
        //System.out.println("Persona"+mayor.getDocumento()+ " "+mayor.getNombre());
        System.out.printf("%4d %-20s %3d\n", mayor.getDocumento(), mayor.getNombre(), mayor.getEdad());
    }
}
