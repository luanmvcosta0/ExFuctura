package exerciciosDeIntroducao2POO.exercicioIntroducao2_2;

public class Carro {

    //Atributos:
    public String marca;
    public String modelo;
    public int ano;
    public String cor;
    public double quilometragem;
    public String combustivel;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }


    //Métodos:
    public void ligar() {
        System.out.println("Seu carro esta ligado!");
    }

    public void desligar() {
        System.out.println("Seu carro foi desligado!");
    }

    public void aceletar() {
        System.out.println("Seu carro esta acelerando!");
    }

    public void frear() {
        System.out.println("Seu carro esta freiando!");
    }

    public void abastecer() {
        System.out.println("Seu carro esta sendo abastecido!");
    }


}
