package exerciciosDeIntroducaoPOO.exercicioIntroducao1_2;

public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Luan";
        funcionario.cargo = "Auxiliar de expedição";
        funcionario.salario = 1992.90;

        funcionario.aumentarSalario(20);

        System.out.println(funcionario.salario);

    }

}
