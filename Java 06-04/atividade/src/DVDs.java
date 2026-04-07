public class DVDs extends Produto {

    private int duracao;

    public int getDuracao(){return this.duracao;}
    public void setDuracao(int duracao){this.duracao = duracao;}

    public DVDs (){}

    public DVDs (String nome, double preco, int duracao,  int codigoDeBarras){
        super(nome, preco, codigoDeBarras);
        this.duracao = duracao;
    }

    @Override

    public String toString(){
        return ", Duracão: " + duracao;
    }

}
