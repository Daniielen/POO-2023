package org.exercicio_.poo.exercicio2acampamento;

/**
 *
 * @author Danielen Santana
 * @since 28/09/2023
 * @details Desenvolver uma classe Java chamada Acampamento com os 
 * seguintes atributos: nome, equipe, idade. 
 * A classe Acampamento deverá conter os seguintes métodos: imprimir(), 
 * separarGrupo()
 * @note Exercício proposto no curso de Programação Orientada a Objeto 
 * ministrada pelo professor Dr.Fabio Marques.
 */
public class Acampamento
{
    String nome;
    String equipe;
    int idade;
    
    public void imprimir()
    {
        System.out.println("Nome: " + this.nome + "\nEquipe: " + this.equipe + "\nIdade: " + this.idade + "\n");
    }
    
    public void separarGrupo()
    {
        if ( idade >= 6 && idade <= 10 )
        {
            equipe = "A";
        }
        if (idade >= 11 && idade <= 20 )
        {
            equipe = "B";
        }
        if ( idade > 21 )
        {
            equipe = "C";
        }
    }
}
