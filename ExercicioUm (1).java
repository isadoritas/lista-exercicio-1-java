import java.util.Scanner;

public class ExercicioUm {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, mediaAritmetica;

        String titulo = "Calculadora de Média Aritmética";
        System.out.println(titulo);
        
        System.out.println("Informe o primeiro número: ");
        num1 = sc.nextInt();

        System.out.println("Informe o segundo número: ");
        num2 = sc.nextInt();
        
        mediaAritmetica = (num1 + num2) / 2; 

        System.out.println("A média aritmética é: " + mediaAritmetica);
        
        sc.close();
    }
}