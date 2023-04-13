import java.util.Scanner;

public class ExercicioNove {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int horas, minutos, segundos, restante;

        String titulo = "Conversor de Segundos";
        System.out.println(titulo);

        System.out.println("Digite a quantidade de segundos:");
        segundos = sc.nextInt();

        horas = segundos / 3600;
        restante = segundos % 3600;
        minutos = restante / 60;
        segundos = restante % 60;
        
        System.out.println("O resultado é: " + horas +"h " + minutos + "min " + segundos + "segunos ");

        sc.close();    
}
}