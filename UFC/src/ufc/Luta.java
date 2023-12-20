/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import javafx.scene.chart.PieChart.Data;
import ufc.Lutador;

/**
 *
 * @author danielen
 */
public class Luta {
    
    private int rounds;
    private Boolean aprovada;
    private String data;
    
    Lutador desafiado = new Lutador();
    Lutador desafiante = new Lutador();
    
    public String marcarLuta() {
        String mensagem;
        if ( desafiado.getNome().equalsIgnoreCase(desafiante.getNome()) && desafiado.getCategoria().equalsIgnoreCase(desafiante.getCategoria()) ) {
            
            Locale locale = new Locale("pt", "BR");
            DateFormat dateFormat = DateFormat.getTimeInstance(DateFormat.DEFAULT, locale);
            String data = dateFormat.format(new Date());
           
            setAprovada(true);
            mensagem = "Luta marcada! Horário: " + data + ".";
        } else {
            mensagem = "A luta não foi marcada. Mesmos oponentes ou categorias diferentes.";
            setAprovada(false);
        }
        
        return mensagem;
    }
    
    public String lutar() {
        
        String mensagem = "";
        Random random = new Random();
        
        int numero = random.nextInt(3);
        
        if (getAprovada()) {
            
            switch (numero) {
                case 0:
                    desafiado.empatarLuta();
                    desafiado.empatarLuta();
                    mensagem = "Empate!";
                    break;
                case 1:
                    desafiado.ganharLuta();
                    mensagem = "O lutador " + desafiado.getNome() + " ganhou a luta!";
                    break;
                case 2:
                    desafiante.ganharLuta();
                    mensagem = "O lutador " + desafiante.getNome() + " ganhou a luta!";
                    break;
                default:
                    break;
            }
            
        } else {
            mensagem = "Luta não aprovada.";
        }
        
        return mensagem;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public Boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(Boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}
