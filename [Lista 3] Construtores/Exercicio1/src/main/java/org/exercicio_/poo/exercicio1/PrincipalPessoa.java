package org.exercicio_.poo.exercicio1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Danielen Santana
 * @since 30/09/2023
 * @details Desenvolver o seguinte conjunto de classes: Pessoa e PrincipalPessoa
 * Classe Pessoa: Esta classe deve criar os seguintes atributos: cpf, nome 
 * e dataNasc como privados. Na classe pessoa, criar um construtor vazio
 * e um segundo construtor que receba três parâmetros e atribua-os a seus
 * três atributos. Não Esquecer de criar todos os métodos de acesso e métodos
 * modificadores
 * 
 * Classe PrincipalPessoa: Esta classe deve criar um atributo que seja uma
 * referência para o tipo da classe Pessoa. O objeto será criado (execução do
 * operador new) em um outro momento do exercício.
 * 
 * Implementar o método main() apresentando um menu para que o usuário opte por
 * cadastrar ou imprimir os dados. No método que realizará o cadastramento,
 * solicitar os dados de uma Pessoa e por meio do construtor, atribuí-los
 * ao objeto criado. No momento da leitura da data, realizar sua validação,
 * a fim que seja lida no formato AAAA/MM/DD. Caso não seja lida dessa forma,
 * realizar uma nova solicitação de leitura.
 * 
 * @note Exercício proposto no curso de Programação Orientada a Objeto 
 * ministrada pelo professor Dr.Fabio Marques.
 */

public class PrincipalPessoa 
{
    Pessoa pessoa;
    
    public static void main(String[] args) 
    {
        PrincipalPessoa obj = new PrincipalPessoa();
        Scanner s = new Scanner(System.in);
        
        int resp;
        boolean ativo = true;
        
        while( ativo )
        {
            System.out.println("Escolha uma opção: "
                    + "\n1) Cadastro"
                    + "\n2) Imprimir"
                    + "\n3) SAIR");
            resp = s.nextInt();
            
            switch (resp)
            {
                case 1:
                    obj.cadastrar();
                break;
                case 2:
                    obj.imprimir();
                break;
                case 3:
                    ativo = false;
                break;
            }
        }
        
    }
    
    public void cadastrar()
    {
        String nome;
        int cpf;
        String data_nasc;
        
        Scanner s = new Scanner(System.in);
        SimpleDateFormat data = new SimpleDateFormat("yyyy/MM/dd");
        
        System.out.println("Informe o nome: ");
        nome = s.next();
        
        System.out.println("Informe o CPF: ");
        cpf = s.nextInt();
        
        System.out.println("Informe a data de nascimento: ");
        data_nasc = s.next();
        
        try
        {
            SimpleDateFormat check_data = new SimpleDateFormat("yyyy/MM/dd");
            check_data.setLenient(false);
            
            Date nova_data = check_data.parse(data_nasc);
            data_nasc = data.format(nova_data);
        }
        catch (ParseException e) {
            System.out.println("Data inválida! Tente novamente.");
        }
        
        pessoa = new Pessoa(cpf, nome, data_nasc);
    }
    
    public void imprimir()
    {
        System.out.println("Nome: " + pessoa.getNome() 
                + "\nCPF: " + pessoa.getCPF() 
                + "\nData de Nascimento: " + pessoa.getDataNasc());
    }
}


