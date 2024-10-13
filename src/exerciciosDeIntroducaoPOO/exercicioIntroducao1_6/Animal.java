package exerciciosDeIntroducaoPOO.exercicioIntroducao1_6;

public class Animal {

    public String nome;
    public int idade;
    public String especie;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }


    public void emitirSom() {
        System.out.println("O animal emitiu um som!");
    }

}
