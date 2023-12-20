/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc;

/**
 *
 * @author  danielen
 */
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float peso;
    private String categoria;
    private int vitoria;
    private int derrota;
    private int empates;

    public String apresentar() {
        return "Lutador{" + "nome=" + nome + ", nacionalidade=" + nacionalidade + ", idade=" + idade + ", peso=" + peso + ", categoria=" + categoria +", vitoria=" + vitoria + ", derrota=" + derrota + ", empates=" + empates + "}";
    }
    
    public String status() {
        return "Lutador{" + "nome=" + nome + ", nacionalidade=" + nacionalidade + ", categoria=" + categoria +"}";
    }
    
    public String ganharLuta() {
        vitoria+=1;
        return "Lutador{" + "vitorias=" + vitoria + "}";
    }
    
    public String perderLuta() {
        derrota-=1;
        return "Lutador{" + "derrota=" + derrota + "}";
    }
    
    public String empatarLuta() {
        empates+=1;
        return "Lutador{" + "empatar=" + empates + "}";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
}
