package org.exercicio_.poo.exercicio2.computador;

/**
 * @author Danielen Santana
 * @since 29/09/2023
 * @details Desenvolver uma classe Java chamada Computador com os 
 * seguintes atributos: marca, cor, modelo, numeroSerie, preco. 
 * A classe Computador deverá conter os seguintes métodos: imprimir(), 
 * cacularValor(), alterarValor()
 * @note Exercício proposto no curso de Programação Orientada a Objeto 
 * ministrada pelo professor Dr.Fabio Marques.
 */
public class Computador {
    String marca;
    String cor;
    String modelo;
    String numero_serie;
    float preco;
    
    public void imprimir()
    {
        System.out.println("Marca: " + this.marca + "\nCor: " + this.cor + "\nModelo: " + this.modelo + "\nNumero de série: " + this.numero_serie + "\nPreço: R$" + this.preco + "\n");
    }
    
    public void calcularValor()
    {
        if ( marca.equals("HP") )
        {
            preco += preco / 0.30;
        }
        else if ( marca.equals("IBM") )
        {
            preco += preco / 0.50;
        }
    }
    
    public boolean alterarValor(float altera_preco)
    {
        if ( altera_preco <= 0 )
        {
            return false;
        } 
        else 
        {
            preco = altera_preco;
            return true;
        }
    }
}
