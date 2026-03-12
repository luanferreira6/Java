public class Atividade1 {
    public static void main(String args[]){

    int i = 10, j = 2, x = 0, y = 0; 

        j++;
        ++i;

        x = i++ + j;
        y = ++j + ++i;

        System.out.println("Soma de x: " + x);
        System.out.println("Soma de y: " + y);
    }
    
}
