package exercicioIntroducao1_5;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Lucca Costa");
        pessoa.setIdade(11);
        pessoa.setGenero("Masculino");

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Genero: " + pessoa.getGenero());

    }

}
