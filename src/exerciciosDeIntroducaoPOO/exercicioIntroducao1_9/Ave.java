package exerciciosDeIntroducaoPOO.exercicioIntroducao1_9;

import exerciciosDeIntroducaoPOO.exercicioIntroducao1_7.SerVivo;

public class Ave extends SerVivo {

    private String tipoDeBico;

    public String getTipoDeBico() {
        return tipoDeBico;
    }

    public void setTipoDeBico(String tipoDeBico) {
        this.tipoDeBico = tipoDeBico;
    }

    public void voar() {
        System.out.println("Sua ave " + getNome() + " com o tipo de " + getTipoDeBico() + " esta voando!");
    }

}
