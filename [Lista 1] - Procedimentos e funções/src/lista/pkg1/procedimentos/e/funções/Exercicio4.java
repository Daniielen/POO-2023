
package lista.pkg1.procedimentos.e.funções;

import javax.swing.JOptionPane;

/**
 * @author Danielen Santana
 * @details Faça uma um procedimento que recebe por parâmetro o tempo de duração 
 * de uma fábrica expressa em segundos e 
 * imprima esse tempo em horas, minutos e segundos (hh:mm:ss). 
 * @since 20/09/2023
 */
public class Exercicio4 {
    static public void main(String[] args) {
        String resposta;
        int tempo;
        
        resposta = JOptionPane.showInputDialog("Insira o tempo: ");
        tempo = Integer.parseInt(resposta);
        
        conversao(tempo);
    }
    
    static public void conversao(int tempo) {
        String mensagem = "";
        int h, sr, m, s;
        
        h = tempo / 3600;
        sr = tempo - h * 3600;
        m = sr / 60;
        s = sr - m * 60;
        
        mensagem = h + "h" + m + "m" + s + "s";
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
