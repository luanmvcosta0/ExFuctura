package exerciciosDeIntroducao2POO.exercicioIntroducao2_2;

public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.setMarca("Chevrolet");
        carro.setModelo("Onix");
        carro.setAno(2020);
        carro.setCor("Preto");
        carro.setQuilometragem(36500);
        carro.setCombustivel("Aceita gasolina e Alcool");

        System.out.println("Carro: " + carro.getModelo() + " " + carro.getCor() + " || " + "Ano: " + carro.getAno() + " || " + "Quilometragem total rodada: " + carro.getQuilometragem());

        carro.ligar();
        carro.desligar();
        carro.aceletar();
        carro.frear();
        carro.abastecer();



    }

}
