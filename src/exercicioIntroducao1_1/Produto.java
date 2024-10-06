package exercicioIntroducao1_1;

public class Produto {

    String nome;
    double preco;
    int quantidade;

    public double calcularValor() {
        return preco * quantidade;
    }

}
