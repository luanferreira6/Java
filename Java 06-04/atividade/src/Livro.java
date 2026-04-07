public class Livro extends Produto {        
    private String autor;

    public Livro(){}

    public Livro(String nome, double preco, String autor,  int codigoDeBarras){
        super(nome, preco, codigoDeBarras);
        this.autor = autor;
        
    }


    public String getAutor(){return this.autor;}
    public void setAutor(String autor){this.autor = autor;}    

    @Override
    public String toString(){
        return super.toString()+"\tAutor: " + autor;
    }
    

}
