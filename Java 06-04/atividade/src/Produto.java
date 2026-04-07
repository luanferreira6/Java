public class Produto {
    private String nome;
    private double preco;
    private int codigoDeBarras;

    public String getNome(){return this.nome;}
    public void setNome(String nome){this.nome = nome;}

    public double getPreco(){return this.preco;}
    public void setPreco(double preco){this.preco = preco;}

    public double getcodigoDeBarras(){return this.codigoDeBarras;}
    public void setcodigoDeBarras(int codigoDeBarras){this.codigoDeBarras = codigoDeBarras;}

    public Produto(){}

    public Produto(String nome, double preco, int codigoDeBarras){
        this.nome = nome;
        this.preco = preco;
        this.codigoDeBarras = codigoDeBarras;
    }


    @Override 
    public String toString(){
        return "Nome: " + nome + "Preço: " + preco;
    }


}
