public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--==POLIMORFISMO COM ANIMAIS==--");
        
        Animal animais[] = new Animal[10];
        
        Animal doguinho = new Animal("Oscar", 4, 48.0, 1); 
        animais[0] = doguinho;
        
        animais[1] = new Peixe("Sergio", 0, 10.0, 1, 1);
        
        animais[2] = new Passaro("Pica-pau", 2, 60.0, 1);

        for (Animal a : animais) {
            if (a != null) {
                a.mover();
                System.out.println(a.toString());
            }
        }
    }
}