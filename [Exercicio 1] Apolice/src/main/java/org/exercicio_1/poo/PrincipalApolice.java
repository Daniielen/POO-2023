package org.exercicio_1.poo;

/**
 *
 * @author Danielen Santana
 * @since 28/09/2023
 * @details Desenvolver uma classe Java chamada Apolice com os 
 * seguintes atributos: nomeSegurado, idade e valorPremio. 
 * A classe Apolice deverá conter os seguintes métodos: imprimir(), 
 * calcularPremioApolice(), oferecerDesconto()
 * @note Exercício proposto no curso de Programação Orientada a Objeto 
 * ministrada pelo professor Dr.Fabio Marques.
 */
public class PrincipalApolice {
    public static void main(String[] args)
    {
        Apolice novo_obj = new Apolice();
        
        novo_obj.imprimir();
        
        novo_obj.calcularPremioApolice();
        
        novo_obj.imprimir();
        
        novo_obj.oferecerDesconto("Rio de Janeiro");
       
        novo_obj.imprimir();
    }
}
