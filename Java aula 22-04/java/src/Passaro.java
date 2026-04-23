public class Passaro extends Animal {

    public Passaro() {
        super();
    }

    public Passaro(String nome, int patas, double velocidade, int localizacao) {
        super(nome, patas, velocidade, localizacao);
    }

    @Override
    public void mover() {
        System.out.println("Pássaro " + getNome() + " batendo as asas e voando ------->");
        super.setLocalizacao(getLocalizacao() + 5); 
    }

    @Override
    public String toString() {
        return "Passaro [" + super.toString() + "]";
    }
}