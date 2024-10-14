package exerciciosDeIntroducao1POO.exercicioIntroducao1_8;

public class Main {

    public static void main(String[] args) {

        Mamifero mae = new Mamifero();
        Mamifero filhote = new Mamifero();


        //Estou considerando que esses animais são 2 porquinhos :)
        mae.setNome("Francisca");
        mae.setIdade(9);
        mae.setGenero("Femea");

        filhote.setNome("Rodolfo");
        filhote.setIdade(1);
        filhote.setGenero("Macho");

        mae.amamentar(filhote);
    }

}
