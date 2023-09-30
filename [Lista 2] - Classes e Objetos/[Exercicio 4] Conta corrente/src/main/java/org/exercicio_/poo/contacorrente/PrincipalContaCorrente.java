
package org.exercicio_.poo.contacorrente;

import java.util.Scanner;

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

public class PrincipalContaCorrente {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        ContaCorrente cliente = new ContaCorrente();
        
        int resp, option;
        
        do
        {
            System.out.println("Sistema - Conta Corrente\n" 
                               + "\nEscolha uma operação abaixo: " 
                               +"\n1) Saque" 
                               +"\n2) Depositar" 
                               +"\n3) Consultar" 
                               +"\n4) Cadastrar" );
            option = s.nextInt();
            switch(option)
            {
                case 1:
                    execSaque(cliente, 0, s);
                break;

                case 2:
                    execDeposito(cliente, 0, s);
                break;
                case 3:
                    execConsulta(cliente);
                break;
                case 4:
                    execCadastrar(cliente, s);
                break;
            }
            System.out.println("Deseja continuar? [1=SIM; 0=NAO]: ");
            resp = s.nextInt();
        }while ( resp != 0 ); 
    }
    
    public static void execSaque(ContaCorrente cliente, float valor, Scanner s)
    {
        boolean foiSacado;
        
        System.out.println("Valor que deseja sacar: ");
        valor = s.nextFloat();
        
        foiSacado = cliente.sacar(valor);
        
        if ( foiSacado )
        {
            System.out.println("\nSaque Realizado");
        }
        else
        {
            System.out.println("\nSaque NÃO realizado");
        }
    }
    
    public static void execDeposito(ContaCorrente cliente, float valor, Scanner s)
    {
        System.out.println("Valor que deseja depositar: ");
        valor = s.nextFloat();
        cliente.depositar(valor);
    }
    
    public static void execConsulta(ContaCorrente cliente)
    {
        cliente.imprimir();
    }
    
    public static void execCadastrar(ContaCorrente cliente, Scanner s)
    {
        String nome;
        int conta;
        int agencia;
        
        // Entrada de dados
        System.out.println("Informe seu nome: ");
        nome = s.next();
        
        System.out.println("Informe sua conta: ");
        conta = s.nextInt();
        
        System.out.println("Informe sua agência: ");
        agencia = s.nextInt();
        
        // Atribuindo os dados aos atributos
        cliente.nome_cliente = nome;
        cliente.conta = conta;
        cliente.agencia = agencia;
        cliente.imprimir();
    }
}
