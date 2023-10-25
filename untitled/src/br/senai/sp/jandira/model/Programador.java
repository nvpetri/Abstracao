package br.senai.sp.jandira.model;

public class Programador extends Funcionarios {
    private int horasExtras;

    public Programador(String nome, int id, double salarioBase, int horasExtras) {
        super(nome, id, salarioBase);
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (horasExtras * 20);
    }

    public int getHorasExtras() {
        return horasExtras;
    }
}