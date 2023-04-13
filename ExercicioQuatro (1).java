import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        double capital, prazo, taxa, resultado; 
    
        String titulo = "Calculadora de Juros Compostos";
        System.out.println(titulo);
 
        System.out.println("Informe o valor do capital investido: ");
        capital = sc.nextInt();
    
        System.out.println("Informe o prazo de aplicação: ");
        prazo = sc.nextInt();
   
        System.out.println("Informe a taxa de juros mensal: ");
        taxa = sc.nextInt();
    
        resultado = (capital * Math.pow (1 + taxa, prazo ));
        System.out.println("O montante a ser recebido é R$: " + resultado); 
        sc.close();
    }
} 
