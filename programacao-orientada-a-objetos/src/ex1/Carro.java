package ex1;

public class Carro {
    String cor;
    String marca;
    String nome;
    double capacidadeDoTanque;

    double totalValorTanque(double valorCombustivel) {
        return capacidadeDoTanque * valorCombustivel;
    }

    Carro() {
    }

    public Carro(String cor,String marca, String nome, double capacidadeDoTanque) {
        this.cor = cor;
        this.marca = marca;
        this.nome = nome;
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCapacidadeDoTanque() {
        return capacidadeDoTanque;
    }

    public void setCapacidadeDoTanque(double capacidadeDoTanque) {
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "cor='" + cor + '\'' +
                ", nome='" + nome + '\'' +
                ", capacidadeDoTanque=" + capacidadeDoTanque +
                '}';
    }
}
