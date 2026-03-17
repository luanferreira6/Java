import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int vetor1[] = new int[10];
        int vetor2[] = new int[10];
        int vetor3[] = new int[10];// vetor para guardar a interseçâo

        Scanner sc = new Scanner(System.in);
        int k = 0;

        // leitura vetor1
        for(int i = 0; i < 10; i++){
            System.out.println("Digite um numero para vetor 1: ");
            vetor1[i] = sc.nextInt();
        }

        // leitura vetor2
        for(int i = 0; i < 10; i++){
            System.out.println((i+1) +"Digite um numero para vetor 2: ");
            vetor2[i] = sc.nextInt();
        }

        // comparação
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(vetor1[i] == vetor2[j]){
                    vetor3[k] = vetor1[i];
                    k++;
                }
            }
        }

        System.out.println("Os numeros iguais entre os vetores sao:");

        for(int i = 0; i < k; i++){
            System.out.println(vetor3[i]);
        }

        sc.close();
    }
}