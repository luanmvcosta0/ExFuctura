package exerciciosDeIntroducao2POO.exercicioIntroducao2_1;

public class Main {

    public static void main(String[] args) {

        Tarefa tarefa = new Tarefa();

        tarefa.setDescricao("Fazer relatório.");
        tarefa.setDataCriacao("14/10/2024");
        tarefa.setEstado(false);

        tarefa.tarefaEstaConcluida();

    }

}
