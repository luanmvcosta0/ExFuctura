package exerciciosDeIntroducao2POO.exercicioIntroducao2_1;

import java.time.LocalDate;

public class Tarefa {

    //Atributos
    private String descricao;
    private String dataCriacao;
    private Boolean estado;   //verificar se a tarefa foi concluida ou não.

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }




    public void tarefaEstaConcluida() {
        if(estado == true) {
            System.out.println("Sua tarefa esta concluida!");
        } else {
            System.out.println("Voce não terminou a tarefa, volte a fazer!");
        }


    }



}
