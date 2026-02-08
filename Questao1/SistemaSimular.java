import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SistemaSimular{
    public static void main(String[] args){
        Queue<Integer> Fila1 = new LinkedList<>();
        Scanner ler = new Scanner(System.in);

        int numDig;
        do{
            System.out.print("Digite alguns números aqui!! -> ");
            numDig = ler.nextInt();
            Fila1.add(numDig);
        }while(numDig != -1);

        System.out.println();
        int tamFila = Fila1.size();
        int apoio = 0;
        float soma = 0f;

        if(!(Fila1.isEmpty())){
            int maior = Fila1.peek();
            int menor = Fila1.peek();

            for (int i : Fila1){
                if (i > maior){
                    maior = i;
                }
                else if (i < maior){
                    menor = i;
                }

                apoio += i;
                soma = apoio / tamFila;

            }
            System.out.println("A quantidade de números digitados é: " + tamFila);
            System.out.println("O maior número digitado é: " + maior);
            System.out.println("O menor número digitado é: " + menor);
            System.out.println("A média dos números digitados é: " + soma);
        }
    }
}