import java.util.Scanner;

public class AlgoritmoPotenciador {
    public static void main(String[] args) {
        //Sacar la potencia de 2 numeros  y mostrar por pantalla.

        int num1;//Base
        int num2;//Exponente
        int res=1;

        System.out.println("Indique el numero base: ");
        Scanner sc= new Scanner (System.in);
        num1=sc.nextInt();

        System.out.println("Indique el numero exponente: ");
        num2=sc.nextInt();

        for (;num2>0;num2--)res*=num1;

        System.out.println("El resultado de la potencia es: " + res);

    }
}
