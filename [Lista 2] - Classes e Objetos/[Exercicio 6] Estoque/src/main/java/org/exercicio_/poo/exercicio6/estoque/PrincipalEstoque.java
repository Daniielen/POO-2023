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

public class PrincipalEstoque {

    public static void main(String[] args) 
    {
        Estoque produto_1 = new Estoque();
        Estoque produto_2 = new Estoque();
        Estoque produto_3 = new Estoque();
        
        produto_1.nome_produto = "Caneta";
        produto_1.quantidade = 0;
        produto_1.valor = 2.50f;
        
        produto_2.nome_produto = "Post-it";
        produto_2.quantidade = 0;
        produto_2.valor = 5.00f;
        
        produto_3.nome_produto = "Caderno";
        produto_3.quantidade = 100;
        produto_3.valor = 28.60f;
        
        produto_1.imprimir();
        produto_2.imprimir();
        produto_3.imprimir();
        
        produto_1.removerProdutos(2);
        produto_1.imprimir();
        
        produto_2.removerProdutos(5);
        produto_2.imprimir();
        
        produto_3.imprimir();
        produto_3.removerProdutos(10);
    }
}
