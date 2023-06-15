package ex1;

public class RodarAplicacao {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.setMarca("Alfa Romeu");
        carro1.setNome("Giulia");
        carro1.setCor("Azul");
        carro1.setCapacidadeDoTanque(50.0);

        System.out.println(carro1.getMarca());
        System.out.println(carro1.getNome());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeDoTanque());
        System.out.println("Valor para encher o tanque de combustiuvel: R$" + carro1.totalValorTanque(6.80) + "\n");

        //Aplicação mais elaborada.

        Carro carro2 = new Carro("Chevrolet", "Camaro","Preto", 55);
        System.out.println(carro2.toString());
        System.out.println("Valor para encher o tanque de combustiuvel: R$" + carro2.totalValorTanque(7.80));

    }
}
