package br.senai.sp.jandira.model;

public class Gerente extends Funcionarios {
    private double bonusGerencia;

    public Gerente(String nome, int id, double salarioBase, double bonusGerencia) {
        super(nome, id, salarioBase);
        this.bonusGerencia = bonusGerencia;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonusGerencia;
    }
    public double getBonusGerencia() {
        return bonusGerencia;
    }

}