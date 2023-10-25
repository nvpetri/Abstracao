package br.senai.sp.jandira.model;

abstract class Funcionarios {

    private String nome;
    private int id;

    private double baseSalario;

    public Funcionarios(String nome, int id, double baseSalario) {
        this.nome = nome;
        this.id = id;
        this.baseSalario = baseSalario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseSalario() {
        return baseSalario;
    }

    public void setBaseSalario(double baseSalario) {
        this.baseSalario = baseSalario;
    }
}
