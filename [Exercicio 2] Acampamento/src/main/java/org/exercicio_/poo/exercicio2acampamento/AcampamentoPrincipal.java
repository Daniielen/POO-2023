package org.exercicio_.poo.exercicio2acampamento;

/**
 *
 * @author Danielen Santana
 * @since 28/09/2023
 * @details Desenvolver uma classe Java chamada Acampamento com os 
 * seguintes atributos: nome, equipe, idade. 
 * A classe Apolice deverá conter os seguintes métodos: imprimir(), 
 * separarGrupo()
 * @note Exercício proposto no curso de Programação Orientada a Objeto 
 * ministrada pelo professor Dr.Fabio Marques.
 */

public class AcampamentoPrincipal {

    public static void main(String[] args)
    {
        Acampamento acmp = new Acampamento();
        
        acmp.nome = "Yza";
        acmp.idade = 12;
        acmp.equipe = "none";
        
        acmp.imprimir();
        
        acmp.separarGrupo();
        
        acmp.imprimir();
        
        acmp.nome = "Caio";
        acmp.idade = 19;
        acmp.equipe = "none";
        
        acmp.imprimir();
        
        acmp.separarGrupo();
        
        acmp.imprimir();
    }
}
