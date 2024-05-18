/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caixa.eletronico;

import javax.swing.JOptionPane;

/**
 *
 * @author operador
 */
public class CaixaEletronico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean b = true;
        
        int opcao = 0;
        double saque;
        double deposito;
        
        opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opcao:\n1. Saque\n2. Deposito\n3.Extrato\n4 criarconta"));
        Conta conta = new Conta();
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opcao:\n1. Saque\n2. Deposito\n3.Extrato\n4 criarconta"));

            switch (opcao) {
                case 1:
                    saque = Integer.parseInt(JOptionPane.showInputDialog("digite um valor para sacar"));
                    conta.sacar(saque);

                    break;
                case 2:
                    deposito = Integer.parseInt(JOptionPane.showInputDialog("digite um valor para depositar"));
                    conta.deposito(deposito);
                    break;
                case 3:
                    conta.extrato();
                    break;
                case 4:
                    conta.criarConta();
                    break;
                default:
            }
        }while (b == true);
    }
}


