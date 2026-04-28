import java.util.ArrayList;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("---- POLIMORFISMO Com Animais ----");
        //Animal animais[] = new Animal[10];
        Scanner sc = new Scanner(System.in);
        ArrayList<Animal> animaisList = new ArrayList<>();
        String menu = "1 - Cadastrar animais \n" +
                      "2 - Listar animais \n" +
                      "3 - Mover animais \n" +
                      "4 - Editar animais \n" +
                      "0 - Sair";
        int option = 0;
        do {
            System.out.println(menu);
            option = sc.nextInt();
            sc.nextLine();
            switch (option){
                case 1:
                    System.out.println("1 - Cadastrar  animal");
                    System.out.println("Escolha qual animal deseja cadastrar \n"+"1 - Animal Generico \n"+"2 - Peixe\n"+"3 - Ave\n");
                    int tipoAnimal = sc.nextInt();
                    System.out.println("Digite o nome do animal:");
                    String nome = sc.next();
                    System.out.println(" Digite a quantidade de patas do animal: ");
                    int patas = sc.nextInt();
                    System.out.println("Digite a velocidade do animal: ");
                    double velocidade = sc.nextDouble();
                    System.out.println("Digite um valor inteiro de localizacao: ");
                    int localizacao = sc.nextInt();

                    //ESPECIFIDADES

                    switch (tipoAnimal) {
                        case 1:
                            Animal a = new Animal(nome, patas, velocidade, localizacao);
                            animaisList.add(a);
                        System.out.println("Temos "+ animaisList.size()+"animais cadastrados");
                            break;

                        case 2: 
                        System.out.println("Digite em qual tipo de agua este peixe vive: "+"0 - agua doce"+ "1 - agua salgada");
                        int agua = sc.nextInt();
                        Peixe p = new Peixe(nome, patas, velocidade, localizacao, agua);
                        animaisList.add(p);
                        System.out.println("Temos "+ animaisList.size()+ "animais cadastrados: ");
                            break;
                        case 3: 
                        Passaro ave = new Passaro(nome, patas, velocidade, localizacao);
                        animaisList.add(ave);
                        System.out.println("Temos "+ animaisList.size()+ "animais cadastrados: ");
                        
                        break;


                    }
                    break;
                case 2:
                    System.out.println("2 - Listar animais ");
                    for(Animal animalItem : animaisList){
                        System.out.println(animalItem.toString());

                    }
                    break;
                case 3:
                    System.out.println("3 - Mover Animal");
                    for(Animal a : animaisList){
                        a.mover();
                    }
                    break;



                case 4:
                    System.out.println("4 - ");
                    break;

                    
                case 0:
                    System.out.println("0 - ");
                    break;                          
            }
        } while (option != 0);
        sc.close();  
    }
    
}



