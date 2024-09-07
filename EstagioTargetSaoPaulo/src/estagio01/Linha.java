package estagio01;

public class Linha {
    private int dia;
    private double valor;

    // Construtor
    public Linha(int dia, double valor) {
        this.dia = dia;
        this.valor = valor;
    }

    // Getters
    public int getDia() {
        return dia;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Dia: " + dia + ", Valor: " + valor;
    }
}