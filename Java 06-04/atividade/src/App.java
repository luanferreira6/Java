public class App {
    public static void main(String[] args) {

        Produto[] produtos = new Produto[5];

        produtos[0] = new Livro("Java Básico", 50.0, 111, "João Silva");
        produtos[1] = new CD("Rock Hits", 30.0, 222, 12);
        produtos[2] = new DVD("Filme Ação", 40.0, 333, 120);
        produtos[3] = new Livro("POO na Prática", 60.0, 444, "Maria Souza");
        produtos[4] = new CD("Pop Internacional", 25.0, 555, 10);

        for (int i = 0; i < produtos.length; i++) {
            System.out.println(produtos[i]);
        }

        // Teste simples de equals (se você implementar depois)
        Produto p1 = new Livro("Teste", 10.0, 999, "Autor A");
        Produto p2 = new CD("Outro", 20.0, 999, 5);

        System.out.println("São iguais? " + p1.equals(p2));
    }
}