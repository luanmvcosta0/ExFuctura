package exerciciosDeIntroducaoPOO.exercicioIntroducao1_3;

public class Main {

    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo();
        retangulo.largura = 10;
        retangulo.altura = 5;

        double totalArea = retangulo.calcularArea(retangulo.largura, retangulo.altura);
        System.out.println("Área do retangulo: " + totalArea);

        double totalPerimetro = retangulo.calcularPerimetro(retangulo.largura, retangulo.altura);
        System.out.println("Perimetro do retangulo: " + totalPerimetro);




    }

}
