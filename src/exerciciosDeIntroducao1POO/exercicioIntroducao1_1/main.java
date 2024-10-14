package exerciciosDeIntroducao1POO.exercicioIntroducao1_1;

public class main {

    public static void main(String[] args) {

        Produto produto = new Produto();
        produto.nome = "Camiseta";
        produto.preco = 49.99;
        produto.quantidade = 3;

        double total = produto.calcularValor();

        System.out.println("Valor total: " + total);

    }

}
