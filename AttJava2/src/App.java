public class App {
    public static void main(String[] args) throws Exception {
        
        Calculadora calc = new Calculadora();

        calc.numero1(5);
        calc.numero2(5);

        System.out.println(calc.toString());

    }
}
