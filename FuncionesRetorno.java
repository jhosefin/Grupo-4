/*4 Funciones:
A partir de 2 parámetros recibidos, crear una función que realice suma-resta-multiplicación-división y retorne el resultado*/

public class FuncionesRetorno {
    
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
        System.out.println(Suma(5, 7));
        System.out.println(Resta(7, 5));
        System.out.println(Multiplicar(7, 5));
        System.out.println(Division(0, 5));
    }
}
