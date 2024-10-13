package exerciciosDeIntroducaoPOO.exercicioIntroducao1_7;

public class Main {

    public static void main(String[] args) {

        SerVivo serVivo = new SerVivo();

        serVivo.setNome("Cavalo");
        serVivo.setIdade(9);

        System.out.println("Nome do Ser Vivo: " + serVivo.getNome());
        System.out.println("Idade do Ser Vivo: " + serVivo.getIdade());


    }

}

