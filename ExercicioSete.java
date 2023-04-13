import java.util.Scanner;

public class ExercicioSete {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double salarioFixo, vendas, percentualVendas, salarioFinal;
        
        String titulo = "Salário Total";
        System.out.println(titulo);

        System.out.println("Digite o salário fixo:");
        salarioFixo = sc.nextDouble();
        
        System.out.println("Digite o valor total de vendas:");
        vendas = sc.nextDouble();
        
        System.out.println("Digite o percentual ganho sobre as vendas:");
        percentualVendas = sc.nextDouble();
        
        salarioFinal = (salarioFixo) + ((vendas * percentualVendas) / 100);
        
        System.out.println("\nO salário total é: " + salarioFinal);
        sc.close();      
    }
    
}  