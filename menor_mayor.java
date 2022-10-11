import java.util.Scanner; // el programa utiliza la clase Scanner

public class menor_mayor
{
    public static void main(String[] args)
 {
    try (Scanner entrada = new Scanner(System.in)) {
        int numero1; // primer número a comparar
        int numero2; // segundo número a comparar
        int numero3;
        int numero4;
        int numero5;


        System.out.print("Escriba el primer entero: "); // indicador
        numero1 = entrada.nextInt(); // lee el primer número del usuario

        System.out.print("Escriba el segundo entero: "); // indicador
        numero2 = entrada.nextInt(); // lee el segundo número del usuario

        System.out.print("Escriba el tercer entero: "); // indicador
        numero3 = entrada.nextInt(); 

        System.out.print("Escriba el cuarto entero: "); // indicador
        numero4 = entrada.nextInt(); 

        System.out.print("Escriba el quinto entero: "); // indicador
        numero5 = entrada.nextInt(); 

        if (numero1 == numero2 == numero3 == numero4 == numero5 )
        System.out.printf("%d == %d%n", numero1, numero2,numero3,numero4,numero5);

        if (numero1 != numero2)
        System.out.printf("%d != %d%n", numero1, numero2);

        if (numero1 < numero2)
        System.out.printf("%d < %d%n", numero1, numero2);

        if (numero1 > numero2)
        System.out.printf("%d > %d%n", numero1, numero2);

        if (numero1 <= numero2)
        System.out.printf("%d <= %d%n", numero1, numero2);

        if (numero1 >= numero2)
        System.out.printf("%d >= %d%n", numero1, numero2);
    }
} // fin del método main
} // fin de la clase Comparacio