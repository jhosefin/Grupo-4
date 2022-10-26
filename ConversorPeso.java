import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;

public class ConversorPeso {



    public static void main(String[] args) {          
        Console console = System.console();          
        int veces = Integer.parseInt(console.readLine("Ingrese las veces que desea calcular su peso: "));
        ArrayList <Double> resultadosTransformacion = new ArrayList <Double> (Arrays.asList());
           
        while(veces!=0){
        
            int opcion = Integer.parseInt(console.readLine("Ingrese 1 : si desea covertir el peso en marte \n O Ingrese 2 : si desea covertir el peso en la luna \n"));
            int peso1 = Integer.parseInt(console.readLine("Ingrese su peso: "));        
           if(opcion == 1){
             
            Double marte = (peso1 / 9.81 ) * 3.711 ; 
            System.out.println("El peso ingresado en Marte sería de: "+ marte); 
            resultadosTransformacion.add(marte);
           }else if(opcion == 2){

            
            Double Luna =  peso1  /  9.81 * 1.622 ;             
            System.out.println("El peso ingresado en La luna sería de: "+ Luna);  
            resultadosTransformacion.add(Luna);
           }else{
            System.out.println("solo puede ingresar 1 o 2");
           }
           
                        
          
           
           System.out.println(resultadosTransformacion);
           

            
                        
                       
            
           veces--;
    
        }
       
    }

     

}


  









    

