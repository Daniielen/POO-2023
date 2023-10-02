package org.exercicio_.poo.exercicio2;

/**
 *
 * @author danie
 */
public class ContaCorrente {
    private int conta;
    private int agencia;
    private double saldo;
    private String nome_cliente;
    
    public ContaCorrente()
    {
        this(0,0,0,"");
    }
    
    public ContaCorrente(int conta, int agencia, double saldo, String nome_cliente)
    {
        this.conta = conta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.nome_cliente = nome_cliente;
    }
    
    public boolean sacar(double valor)
    {
        if ( saldo != 0 && saldo > 0 )
        {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    
    public void depositar(float valor_recebido)
    {
        if ( valor_recebido > 0 )
        {
            saldo += valor_recebido;
        }
    }
    
    public int getConta()
    {
        return conta;
    }
    
    public int getAgencia()
    {
        return agencia;
    }
    
    public String getNomeCliente()
    {
        return nome_cliente;
    }
    
    public double getSaldo()
    {
        return saldo;
    }
    
    public void imprimir()
    {
        System.out.println("Conta: " + this.conta 
                + "\nAgência: " 
                + this.agencia 
                + "\nSaldo: " 
                + this.saldo 
                + "\nCliente: " 
                + this.nome_cliente
                + "\n");
    }  
}
