package exerciciosDeIntroducao1POO.exercicioIntroducao1_8;

import exerciciosDeIntroducao1POO.exercicioIntroducao1_7.SerVivo;

public class Mamifero extends SerVivo{

    private String genero;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void amamentar(Mamifero filhote) {
        System.out.println("A mamãe " + this.getNome() + " esta amamentando o " + filhote.getNome());
    }

}
