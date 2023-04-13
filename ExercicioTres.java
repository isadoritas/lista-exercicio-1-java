import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double n1, C;

        String titulo = "Conversor de Temperatura";
        System.out.println(titulo);

        System.out.println("Informe a temperatura em Fahrenheit:");
        n1 = sc.nextInt();
        
        C = (n1 - 32) / 1.8;
        
        System.out.println("A temperatura convertida para graus Celsius é:" + C + " °C");
        sc.close();        
    }
}