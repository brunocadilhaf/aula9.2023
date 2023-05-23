package Pacote3;

public class Motorista extends Pessoa {
    private int matricula;
    private Carro veiculoAtual;

    public Carro getVeiculoAtual() {
        return veiculoAtual;
    }

    public void setVeiculoAtual(Carro veiculoAtual) {
        this.veiculoAtual = veiculoAtual;
    }

    public Motorista() { }

    public Motorista(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void acelerar(int limite) {
        this.veiculoAtual.acelerar(limite);
    }
}
