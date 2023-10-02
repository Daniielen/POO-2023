package org.exercicio_.poo.exercicio2;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class PrincipalContaCorrente {
    ContaCorrente cc;
    public static void main(String[] args) 
    {
        PrincipalContaCorrente obj = new PrincipalContaCorrente();
        Scanner s = new Scanner(System.in);
        
        int option;
        
        loop: while ( true )
        {
            System.out.println("Escolha uma operação abaixo: "
                    + "\n1) Cadastrar"
                    + "\n2) Imprimir"
                    + "\n3) SAIR");
            option = s.nextInt();
            
            switch(option)
            {
                case 1:
                    obj.execCadastrar(s);
                break;
                case 2:
                    obj.imprimir();
                break;
                case 3:
                break loop;
            }
        }
    }
    
    public void execCadastrar(Scanner s)
    {
        String nome;
        int conta;
        int agencia;
        double saldo;
        
        // Entrada de dados
        System.out.println("Informe seu nome: ");
        nome = s.next();
        
        System.out.println("Informe sua conta: ");
        conta = s.nextInt();
        
        System.out.println("Informe sua agência: ");
        agencia = s.nextInt();
        
        System.out.println("Informe seu saldo: ");
        saldo = s.nextFloat();
        
        // Atribuindo os dados aos atributos
        cc = new ContaCorrente(conta, agencia, saldo, nome);
    }
    
    public void imprimir()
    {
        System.out.println("Nome: " + cc.getNomeCliente() 
                + "\nConta: " + cc.getConta()
                + "\nAgencia: " + cc.getAgencia()
                + "\nSaldo: " + cc.getSaldo());
    }
}
