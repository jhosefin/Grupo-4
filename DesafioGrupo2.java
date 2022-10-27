import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DesafioGrupo2 {

    public static void main(String[] args) {
        Console console = System.console();
        System.out.println("*******Bienvedidos********");
        int cantidad = Integer.parseInt(console.readLine("Ingrese la cantidad de Alumnos/as que va a ingresar al sistema: "));

        //ArrayList <Integer> valorNotas = new ArrayList <Integer>();
        Map<String, ArrayList> miHashMap = new HashMap<String, ArrayList>();
        
    for(int i = 0; i < cantidad ; i++){ 
        ArrayList <Integer> valorNotas = new ArrayList <Integer>();
        String Alumnos = console.readLine("Ingrese El nombre del Alumno/a: " );

        for(int j = 1; j < 4; j++){ 
        int notas = Integer.parseInt(console.readLine("Ingrese la " + j + " Nota del Alumno/a: "));
        valorNotas.add(notas); 
        }
        System.out.println("*********************************");
        miHashMap.put(Alumnos,valorNotas);
    }
    //System.out.println(miHashMap);
    miHashMap.forEach((k,v)-> System.out.println("Nombre: " + k + " Notas: " + v));
    }
    
}
