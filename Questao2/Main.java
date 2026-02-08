import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DistanciaHamming chamar = new DistanciaHamming();
        System.out.println("Digite aqui a cadeia de DNA!");
        String dna1 = ler.nextLine();
        String dna2 = ler.nextLine();
        
        int resultado = chamar.calcularDistancia(dna1, dna2);
        System.out.println("A distância de Hamming é: " + resultado); 
    }
}
