import java.io.Console;
import java.util.ArrayList;


/*Escriba un programa donde el usuario ingrese una calificación de un estudiante y el programa devuelva una nota basada en las siguientes condiciones:
Suspendió si obtuvo una nota igual o inferior a 3.
Insuficiente si tuvo mayor a 3 pero menos que 5 (inclusive)
Bueno si obtuvo una nota mayor a 5 pero menor a 8 (inclusive)
Excelente si consiguió un 10
Debe avisar si se ingresa un número fuera del rango (0 a 10)*/


public class ArraylisConversor {

    public static void main(String[] args) {

        Console console = System.console();
        int cantidad = Integer.parseInt(console.readLine("Cuantas calificaciones va a ingresar "));

        ArrayList <Integer> valores = new ArrayList <Integer>();

        for (int i = 0; i < cantidad; i++){
            int calificacion = Integer.parseInt(console.readLine("Ingrese su calificación: "));
            valores.add(calificacion); 
        System.out.println("------------------------");
        System.out.println("");
        while(calificacion < 0 || calificacion > 10){
            calificacion = Integer.parseInt(console.readLine("Vuelva a ingresar su nota, Recuerde que debe estar comprendido entre 0 y 10: "));
        }
        System.out.println("------------------------");
        System.out.println("");

        
        if(calificacion <= 3){
            System.out.println("El resultado de su puntaje es: Suspendido");
            System.out.println("------------------------");
            System.out.println("");
        }else if(calificacion > 3 && calificacion <= 5){
            System.out.println("El resultado de su puntaje es: Insuficiente");
            System.out.println("------------------------");
            System.out.println("");
        }else if(calificacion > 5 && calificacion <= 8){
            System.out.println("El resultado de su puntaje es: Bueno");
            System.out.println("------------------------");
            System.out.println("");
        }else if(calificacion == 9 || calificacion == 10 ){
            System.out.println("El resultado de su puntaje es: Excelente");
            System.out.println("------------------------");
            System.out.println("");
        }

        }
        
            System.out.println("Nota" + valores );

    }
}
