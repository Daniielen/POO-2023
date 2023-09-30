package org.exercicio_.poo.exercicio6.estoque;

/**
 * @author Danielen Santana
 * @since 30/09/2023
 * @details Desenvolver uma classe Java chamada Estoque com os 
 * seguintes atributos: nomeProduto, valor e quantidade. 
 * A classe Eleitoral deverá conter os seguintes métodos: imprimir();
 * verificarDisponibilidade(); removerProdutos();
 * @note Exercício proposto no curso de Programação Orientada a Objeto 
 * ministrada pelo professor Dr.Fabio Marques.
 */
public class Estoque {
    String nome_produto;
    float valor;
    int quantidade;
    
    public int verificarDisponibilidade(int qtd_disponivel)
    {
        if ( qtd_disponivel > 0 && quantidade >= qtd_disponivel )
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    
    public int removerProdutos(int qtd_remover)
    {
        if ( verificarDisponibilidade(qtd_remover) == 1)
        {
            quantidade -= qtd_remover;
            return 1;
        }
        else
        {
            System.out.println("Não foi possível remover a quantidade solicitada");
            return 0;
        }
    }
    
    public void imprimir()
    {
        System.out.println("Nome do produto: " + this.nome_produto + "\nValor: " + this.valor + "\nQuantidade: " + this.quantidade + "\n");
    }
}
