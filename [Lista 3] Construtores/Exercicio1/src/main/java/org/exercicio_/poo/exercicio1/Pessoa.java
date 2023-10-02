package org.exercicio_.poo.exercicio1;

/**
 *
 * @author danie
 */

public class Pessoa {
    private int cpf;
    private String nome;
    private String data_nasc;
    
    public Pessoa()
    {
        this(0,"","");
    }
    
    public Pessoa(int cpf, String nome, String data_nasc)
    {
        this.cpf = cpf;
        this.nome = nome;
        this.data_nasc = data_nasc;
    }
    
    public int getCPF()
    {
        return cpf;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public String getDataNasc()
    {
        return data_nasc;
    }
    
    public void imprimir()
    {
        System.out.println("Nome: " + this.nome + "\n CPF: " + this.cpf + "\nData de Nascimento: " + this.data_nasc);
    }
}