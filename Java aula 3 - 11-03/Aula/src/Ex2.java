import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        
        String meses[] = {"Janeiro",
                          "Fevereiro",
                          "Março",
                          "Abril",
                          "Maio",
                          "Junho",
                          "Julho",
                          "Agosto",
                          "Setembro",
                          "Outubro",
                          "Novembro",
                          "Dezembro"};
                          
        Scanner sc = new Scanner(System.in);
        System.out.println(" Digite um numero de 1 a 12 ");

        int digitado = sc.nextInt();
        digitado--;
        if(digitado > 12 || digitado < 1){
            System.out.println("O numero digitado nao é permitido");
        }else{
        //exiba a qual mes o numero digitado se refere (somente de 1 a 12)
        System.out.println(" o mes digitado é " + meses[digitado]);
        }   

        sc.close();
        //sempre no final do codigo 10
    }
    
}
