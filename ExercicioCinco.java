import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double horasTrabalhadas, valorHoras, salarioFamilia, numeroFilhos, salarioBruto;
        
        String titulo = "Salário Bruto";
        System.out.println(titulo);

        System.out.println("Informe as horas trabalhadas no mês:");
        horasTrabalhadas = sc.nextInt();

        System.out.println("Informe o valor recebido por horas trabalhadas no mês:");
        valorHoras = sc.nextDouble();

        System.out.println("Informe o valor do salário família:");
        salarioFamilia = sc.nextInt();

        System.out.println("Número de filhos com idade menor que 14 anos:");
        numeroFilhos = sc.nextInt();

        salarioBruto = (horasTrabalhadas * valorHoras) + (salarioFamilia * numeroFilhos);
        System.out.println("O salário bruto do mês é: R$" + salarioBruto);
        sc.close();
    }
}




