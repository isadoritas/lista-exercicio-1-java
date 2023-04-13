import java.util.Scanner;

public class ExercicioOito {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int carros, motos, veiculos, rodas;
        
        String titulo = "Estacionamento";
        System.out.println(titulo);
                      
        System.out.println("Informe o número de veículos no estacionamento:");
        veiculos = sc.nextInt();
        
        System.out.println("Informe a quantidade de rodas:");
        rodas = sc.nextInt();
        
        motos = ((4 * veiculos) - rodas) / 2;
        carros = (veiculos - motos);
        
        System.out.println("A quantidade de carros é:" + carros);
        System.out.println("A quantidade de motos é:" + motos); 
        sc.close();     
    }    
}
