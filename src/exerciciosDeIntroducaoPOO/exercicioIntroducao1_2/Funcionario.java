package exerciciosDeIntroducaoPOO.exercicioIntroducao1_2;

public class Funcionario {

    String nome;
    String cargo;
    double salario;

    double calcularAumento(double porcentagem) {
        return this.salario * (porcentagem / 100);
    }
    void aumentarSalario(double porcentagem) {
        double aumento = this.calcularAumento(porcentagem);
        this.salario += aumento;
    }

}
