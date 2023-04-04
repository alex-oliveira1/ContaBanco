package ContaBanco.src;

import java.util.Scanner;

public class Conta {
    private int numero;
    private String titular;
    private double saldo;
    
    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    
     
   


    public Conta() {
    
    }





    public Conta(int numero, String titular) {
        this(numero, titular, 0.0);
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Deposito feito com sucessso de "+valor);
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public void exibirDados() {
        System.out.println("Número da conta: " + getNumero());
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: " + getSaldo());
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
   
        
        
     
}
