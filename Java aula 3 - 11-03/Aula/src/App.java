public class App {
    public static void main(String[] args){
    
        double joao = 1.5;
        double ze = 1.1;
        //joao aumenta 0,02 e ze 0,03

        int contAnos = 0;
        //enquanto ze for menor do que joao

        while(ze<joao){
            contAnos++;
            ze+=0.03;
            joao+=0.02;
        }
        System.out.println( contAnos +  " anos para ze atingir " + ze + " metros");
        System.out.println( " joao tem " + joao + " metros");

    }
}
