package exercicioIntroducao1_4;

public class Main {

    public static void main(String[] args) {

        ContaBancaria cb = new ContaBancaria();

        cb.setTitular("Luan Costa");
        cb.setNumero(123456789);
        cb.setSaldo(1500.0);

        System.out.println("Nome titular: " + cb.getTitular());
        System.out.println("Numero da conta bancaria: " + cb.getNumero());
        System.out.println("Saldo atual: " + cb.getSaldo());

    }

}
