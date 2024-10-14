package exerciciosDeIntroducao2POO.exercicioIntroducao2_4;

public class AnimalDeEstimacao {

    private String nome;
    private int idade;
    private String especie;
    private String raca;
    private String porte;
    private String sexo;

    private boolean foiAlimentado;
    private boolean brincou;
    private boolean foiAoVeterinario;
    private boolean passeou;
    private boolean tomouBanho;



    public AnimalDeEstimacao(String nome, int idade, String especie, String raca, String porte, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        this.raca = raca;
        this.porte = porte;
        this.sexo = sexo;
    }


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

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }



    public void alimentar() {
        System.out.println("Alimentando seu bichinho.");
        foiAlimentado = true;
    }

    public void brincar() {
        System.out.println("Brincando com seu bichinho");
        brincou = true;
    }

    public void levarAoVeterinario() {
        System.out.println("Levando seu bichico ao veterinario");
        foiAoVeterinario = true;
    }

    public void passear() {
        System.out.println("Passeando com seu bichinho");
        passeou = true;
    }

    public void darBanho() {
        System.out.println("Dando banho no seu bichinho");
        tomouBanho = true;
    }

    public void treinar() {
        System.out.println("Treinando seu bichinho");
    }

    public void verificarFelicidade() {
        if (foiAlimentado && brincou && foiAoVeterinario && passeou && tomouBanho) {
            System.out.println("Seu bichinho esta muito feliz, parabens!");
        } else {
            System.out.println("Voce precisa dar uma atenção ao seu bixinho, ele esta triste e estressado!");
        }
    }


}
