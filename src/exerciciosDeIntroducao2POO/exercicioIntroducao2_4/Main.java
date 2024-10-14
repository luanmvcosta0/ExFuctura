package exerciciosDeIntroducao2POO.exercicioIntroducao2_4;

public class Main {

    public static void main(String[] args) {

        AnimalDeEstimacao animal = new AnimalDeEstimacao("Chico", 2, "Cachorro", "Yorkshire terrier", "Pequeno", "Macho");

        animal.alimentar();
        animal.brincar();
        animal.levarAoVeterinario();
        animal.passear();
        animal.darBanho();

        animal.verificarFelicidade();

    }

}
