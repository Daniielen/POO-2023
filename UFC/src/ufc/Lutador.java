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
        return "Lutador{" + "empatar=" + empates + "}";
    }
}
