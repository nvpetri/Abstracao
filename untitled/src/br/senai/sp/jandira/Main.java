package br.senai.sp.jandira;

import br.senai.sp.jandira.model.*;
public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("João", 1, 5000.0, 1000.0);
        Programador programador = new Programador("Maria", 2, 3500.0, 10);

        System.out.println("Informações do Gerente:");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("ID: " + gerente.getId());
        System.out.println("Salário Base: R$" + gerente.getSalarioBase());
        System.out.println("Bônus de Gerência: R$" + gerente.getBonusGerencia());
        System.out.println("Salário Total: R$" + gerente.calcularSalario());
        System.out.println();

        System.out.println("Informações do Programador:");
        System.out.println("Nome: " + programador.getNome());
        System.out.println("ID: " + programador.getId());
        System.out.println("Salário Base: R$" + programador.getSalarioBase());
        System.out.println("Horas Extras: " + programador.getHorasExtras() + " horas");
        System.out.println("Salário Total: R$" + programador.calcularSalario());
    }
}
