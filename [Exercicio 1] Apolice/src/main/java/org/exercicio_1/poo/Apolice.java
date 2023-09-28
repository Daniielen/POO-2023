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
public class Apolice {
    // Atributos
    String nome_seguro = "Danielen";
    int idade = 21;
    double valor_premio = 50000;
    
    public void imprimir()
    {
        System.out.println(nome_seguro + "\n" + idade + "\n" + valor_premio);
    }
    
    public void calcularPremioApolice()
    {
        if ( idade > 18 && idade <= 25 )
        {
            valor_premio += (valor_premio * 20) / 100;
        } 
        else if ( idade > 25 && idade <= 36 ) 
        {
            valor_premio += (valor_premio * 15) / 100;
        }
        else if ( idade > 36 ) 
        {
            valor_premio += (valor_premio * 10) / 100;
        }
    }
    
    public double oferecerDesconto(String cidade)
    {
        if ( cidade.equals("Curitiba") ) 
        {
            valor_premio = (valor_premio / 0.2);
        }
        else if ( cidade.equals("Rio de Janeiro") )
        {
            valor_premio = (valor_premio / 0.15);
        }
        else if ( cidade.equals("São Paulo") ) 
        {
            valor_premio = (valor_premio / 0.10);
        }
        else if ( cidade.equals("Belo Horizonte") )
        {
            valor_premio = (valor_premio / 0.05);
        }
        return valor_premio;
    }
}
