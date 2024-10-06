package exercicioIntroducao1_3;

public class Retangulo {

    double largura;
    double altura;


    public double calcularArea(double largura, double altura) {
        double totalArea = largura * altura;
        return totalArea;
    }

    public double calcularPerimetro(double largura, double altura) {
        double totalPerimetro = 2 * (largura + altura);
        return totalPerimetro;
    }



}
