import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        
        if (edad >= 0 && edad <= 120) {
            System.out.println("Su edad es válida.");
        } else {
            System.out.println("Edad inválida.");
        }
        
    }
}