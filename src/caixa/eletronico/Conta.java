/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caixa.eletronico;

import javax.swing.JOptionPane;

/**
 *
 * @author operador
 */
public class Conta {
    
    String nome;
    String cpf;
    String endereco;
    String telefone;
    String email;
    double dinheiro;
    
    Pessoa pessoa = new Pessoa(dinheiro, nome, cpf, endereco, telefone, email);
    
    public void sacar(double valorSaque) {
        double saque = pessoa.getDinheiro() - valorSaque;
        pessoa.setDinheiro(saque);
        System.out.println(pessoa.getDinheiro());
    }
    
    public void deposito( double valorDeposito) {
        double Deposito = pessoa.getDinheiro() - valorDeposito;
        pessoa.setDinheiro(Deposito);
        System.out.println(pessoa.getDinheiro());
    }
    
    public void extrato() {
        JOptionPane.showMessageDialog(null, pessoa.getDinheiro());
    }
    
    public void criarConta() {
        nome = JOptionPane.showInputDialog(null, "Digite um nome:");
        cpf = JOptionPane.showInputDialog(null, "Digiteo cpf:");
        endereco = nome = JOptionPane.showInputDialog(null, "Digiteo endereco:");
        telefone = nome = JOptionPane.showInputDialog(null, "Digite o telefone:");
        email = JOptionPane.showInputDialog(null, "Digite o email:");
        dinheiro = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o dinheiro:"));
        
        pessoa.setNome(nome);
        pessoa.setCpf(cpf);
        pessoa.setEndereco(endereco);
        pessoa.setTelefone(telefone);
        pessoa.setEmail(email);
        pessoa.setDinheiro(dinheiro);
        
        System.out.println(pessoa.getNome() + "\n" + pessoa.getCpf() + "\n" + pessoa.getEndereco() + "\n" + pessoa.getTelefone() + "\n" + pessoa.getEmail());
    }
}
