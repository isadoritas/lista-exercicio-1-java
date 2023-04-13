import java.util.Scanner;

public class ExercicioDez {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        double num1, num2, num3, mediaAritmetica, mediaHarmonica, mediaGeometrica;
        
        String titulo = "Calculadora";
        System.out.println(titulo);

        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextDouble();
        
        System.out.println("Digite o segundo número: ");    
        num2 = sc.nextDouble();
        
        System.out.println("Digite o terceiro número: ");
        num3 = sc.nextDouble();
        
        mediaAritmetica = (num1 + num2 + num3) / 3;
        
        mediaHarmonica = 3 / (1/num1 + 1/num2 + 1/num3);
        
        mediaGeometrica = Math.cbrt(num1 * num2 * num3);
        
        System.out.println("A média aritmética é: " + mediaAritmetica);
        System.out.println("A média harmonica é: " + mediaHarmonica);
        System.out.println("A média geometrica é: " + mediaGeometrica);
        
        sc.close();
}
}