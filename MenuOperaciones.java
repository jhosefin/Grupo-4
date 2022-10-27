import java.io.Console;

public class MenuOperaciones {
    
        //Suma y devolver entero
        static int Suma (int num1, int num2){
            int resultado = 0;
            resultado = num1 + num2;
                return  resultado;
        }
    
    //Resta y devuelve entero
        static int Resta (int num1, int num2){
            int resultado = 0;
            resultado = num1 - num2;
                return  resultado;
        }
    
        //Multiplica y devuelve entero
        static int Multiplicar (int num1, int num2){
            int resultado = 0;
            resultado = num1 * num2;
                return  resultado;
        }
    
          //Divide y devuelve entero
        static Float Division (int num1, int num2){
            Float resultado = 0f;
    
            //Con bucle while**********************
            /*while(num1 == 0 || num2 == 0){
                System.out.println("No se puede dividir por 0");
                break;
            }
            resultado = (float) num1 / num2  ;
            return  resultado;*/
            
    
            //Con condicional If********************
            if (num1 == 0 || num2 == 0){ 
                System.out.println("No se puede dividir por 0");
            }else{ 
            resultado = (float) num1 / num2;
            }
            return  resultado;
        }









    public static void main(String[] args) {
        
        Console console = System.console();

        
        System.out.println("----------------------- Bienvenidos al Menú -------------------------");
        System.out.println(" s Para sumar \n r Para restar \n d Para división \n m Para Multiplicación \n e Para salir ");

        String opcion = console.readLine("Ingrese la opción: ");
        do{ 
        int num1 = Integer.parseInt(console.readLine("Ingresa el primer numero: "));
        int num2 = Integer.parseInt(console.readLine("Ingresa el segundo numero: "));

        
        if (opcion == "d"){
            while(num1 == 0 || num2 == 0){
                num1 = Integer.parseInt(console.readLine("Reingresa el primer numero: "));
                num2 = Integer.parseInt(console.readLine("Reingresa el segundo numero: "));
            }
        }



        switch (opcion){
            case "s":
            System.out.print("La suma de sus números es : ");
            System.out.println(Suma(num1, num2));

            break;
            case "r":
            System.out.print("La Resta de sus números es : ");
            System.out.println(Resta(num1,num2));
            break;
            case "m" :
            System.out.print("La multiplicación de sus números es : ");
            System.out.println(Multiplicar(num1,num2));
            break;
            case "d":
            System.out.print("La División de sus números es : ");
            System.out.println(Division(num1,num2));
            break;
        }
        }while(opcion != "e");
    }
}
