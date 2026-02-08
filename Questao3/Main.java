import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Luhn chamar = new Luhn();
        System.out.println("Digite aqui o número do cartão!");
        String numeroCartao = ler.nextLine();
        System.out.println(chamar.numValido(numeroCartao)); 
    }
}
