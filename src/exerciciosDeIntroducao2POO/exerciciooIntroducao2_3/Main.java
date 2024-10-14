package exerciciosDeIntroducao2POO.exerciciooIntroducao2_3;

public class Main {

    public static void main(String[] args) {

        Musica musica = new Musica("Palma da mão", "Gil Bala", "Brega");

        musica.reproduzir();
        musica.pausar();
        musica.exibirDescricao();

    }

}
