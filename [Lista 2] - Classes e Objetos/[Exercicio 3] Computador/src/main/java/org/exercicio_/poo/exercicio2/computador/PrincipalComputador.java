package org.exercicio_.poo.exercicio2.computador;

/**
 *
 * @author Danielen Santana
 * @since 28/09/2023
 * @details Desenvolver uma classe Java chamada Computador com os 
 * seguintes atributos: marca, cor, modelo, numeroSerie, preco. 
 * A classe Computador deverá conter os seguintes métodos: imprimir(), 
 * cacularValor(), alterarValor()
 * @note Exercício proposto no curso de Programação Orientada a Objeto 
 * ministrada pelo professor Dr.Fabio Marques.
 */

public class PrincipalComputador {

    public static void main(String[] args) 
    {
        boolean wasMod;
        Computador comp_1 = new Computador();
        comp_1.marca = "IBM";
        comp_1.cor = "Branco";
        comp_1.modelo = "IBM 5150";
        comp_1.numero_serie = "RS-232C";
        comp_1.preco = 7853.48f;
        comp_1.imprimir();
        
        comp_1.calcularValor();
        comp_1.imprimir();
        
        wasMod = comp_1.alterarValor(-0.40f);
        
        comp_1.calcularValor();
        comp_1.imprimir();
        
        //wasMod = comp_1.alterarValor(50000.00f);
        comp_1.imprimir();
        
        if ( wasMod )
        {
            System.out.println("\nVALOR ALTERADO");
        }
        else
        {
            System.out.println("\nVALOR NÃO ALTERADO");
        }
    }
}
