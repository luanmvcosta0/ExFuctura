package exerciciosDeIntroducao1POO.exercicioIntroducao1_10;

import exerciciosDeIntroducao1POO.exercicioIntroducao1_7.SerVivo;

public class Planta extends SerVivo {

    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void realizarFotossintese() {
        System.out.println("A planta do tipo " + getTipo() + " está realizando a fotossíntese.");
    }

}
