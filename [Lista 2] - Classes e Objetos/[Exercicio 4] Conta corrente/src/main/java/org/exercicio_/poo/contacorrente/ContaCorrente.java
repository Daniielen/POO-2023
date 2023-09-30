package org.exercicio_.poo.contacorrente;

/**
 * @author Danielen Santana
 * @since 29/09/2023
 * @details Desenvolver uma classe Java chamada ContaCorrente com os 
 * seguintes atributos: conta, agencia, saldo e nomeCliente 
 * A classe ContaCorrente deverá conter os seguintes métodos: sacar();
 * depositar(); imprimir();
 * @note Exercício proposto no curso de Programação Orientada a Objeto 
 * ministrada pelo professor Dr.Fabio Marques.
 */

public class ContaCorrente {
    int conta;
    int agencia;
    float saldo;
    String nome_cliente;
    
    public boolean sacar(float valor)
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
        saldo += valor_recebido;
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
