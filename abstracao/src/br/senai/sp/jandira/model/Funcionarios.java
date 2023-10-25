package br.senai.sp.jandira.model;

abstract class Funcionarios {
    private String nome;
    private int id;
    private double salarioBase;

    public Funcionarios(String nome, int id, double salarioBase) {
        this.nome = nome;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public double getSalarioBase() {
        return salarioBase;
    }


}