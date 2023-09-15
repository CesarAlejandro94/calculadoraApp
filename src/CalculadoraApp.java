import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        //Creamos un objeto para leer datos de consola.
        Scanner consola = new Scanner(System.in);
        while(true){
            System.out.println("**** Aplicacion Calculadora ****");
            mostrarMenu();
            try {
                var opcion = Integer.parseInt(consola.nextLine());
                //Validar que este dentro delas opciones mencionadas
                if (opcion >= 1 && opcion <= 4){
                    ejecutarOperacion(opcion, consola);
                }
                else if (opcion == 5){
                    System.out.println("Hasta la vista baby...");
                    break;
                }
                else {
                    System.out.println("Opcion erronea: " + opcion);
                }
                //Imiprimimos un salto de linea
                System.out.println();
            }catch (Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
        }//Fin While
    }//Fin Main

    private static void mostrarMenu(){
        //Mostrar menu
        //System.out.println("1. Suma \n 2. Resta \n 3. Multiplicacion \n 4. Division \n 5. Salir");
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicacion
                4. Division
                5. Salir
                """);
        System.out.print("Teclea el numero de la opcion a realizar: ");
    }
    private static void ejecutarOperacion(int opcion, Scanner consola){
        System.out.print("Proporciona primer valor: ");
        //agregamos valor ingresado a las variables pero parseamos a entero ya que ingresa como string
        var operando1 = Double.parseDouble(consola.nextLine());
        System.out.print("Ingresa el segundo valor: ");
        var operando2 = Double.parseDouble(consola.nextLine());
        double resultado;
        switch (opcion){
            case 1 -> {
                resultado = operando1 + operando2;
                System.out.println("El resultado de la suma es: " + resultado);
            }
            case 2 -> {
                resultado = operando1 - operando2;
                System.out.println("El resultado de la resta es: " + resultado);
            }
            case 3 -> {
                resultado = operando1 * operando2;
                System.out.println("El resultado de la multiplicacion es: " + resultado);
            }
            case 4 -> {
                resultado = operando1 / operando2;
                System.out.println("El resultado de la division es:" + resultado);
            }
            default -> System.out.println("La opcion es erronea" + opcion);

        }
    }
}//Fin Class
