package org.exercicio_.poo.exercicio5.eleitoral;

/**
 * @author Danielen Santana
 * @since 30/09/2023
 * @details Desenvolver uma classe Java chamada Eleitoral com os 
 * seguintes atributos: nome e idade. 
 * A classe Eleitoral deverá conter os seguintes métodos: imprimir();
 * verificar();
 * @note Exercício proposto no curso de Programação Orientada a Objeto 
 * ministrada pelo professor Dr.Fabio Marques.
 */

public class PrincipalEleitoral {
    int valor;
    public static void main(String[] args) {
        Eleitoral eleitor = new Eleitoral();
        
        eleitor.nome = "Demi";
        eleitor.idade = 31;
        
        eleitor.imprimir();
    }
}
