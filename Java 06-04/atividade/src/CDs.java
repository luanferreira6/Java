public class CDs extends Produto {

    private int NumeroDeFaixas;

    public int getNumeroDeFaixas(){return this.NumeroDeFaixas;}
    public void setNumeroDeFaixas(int NumeroDeFaixas){this.NumeroDeFaixas = NumeroDeFaixas;}

    public CDs (){}

    public CDs (String nome, double preco, int NumeroDeFaixas,  int codigoDeBarras){
        super(nome, preco, codigoDeBarras);
        this.NumeroDeFaixas = NumeroDeFaixas;
    }

    @Override

    public String toString(){
        return ", Numero de Faixas: " + NumeroDeFaixas;
    }

}
