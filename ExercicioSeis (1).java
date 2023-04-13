import java.util.Scanner;

public class ExercicioSeis {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double n1, n2, resultado;

        String titulo = "Logaritmo";
        System.out.println(titulo);
        
        System.out.println("Informe o primeiro número:");
        n1 = sc.nextInt();
        
        System.out.println("Informe o segundo número:");
        n2 = sc.nextInt();
        
        resultado = Math.log(n1) / Math.log(n2);

        System.out.println("O resultado é: " + resultado);
        sc.close();
        
    }
}