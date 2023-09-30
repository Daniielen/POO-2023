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

public class Eleitoral {
    String nome;
    int idade;
    
    public void verificar()
    {
        if ( !( idade > 16) ) {
            System.out.println("Eleitor não pode votar");
        }
        else
        {
            if ( idade >= 16 && idade <= 65 )
            {
                System.out.println("Eleitor deve votar");
            }
            if ( idade > 65 )
            {
                System.out.println("Voto facultativo");
            }
        }
    }
    
    public void imprimir()
    {
        System.out.println("Nome: " + this.nome + "\nIdade: " + this.idade);
        verificar();
    }
}
