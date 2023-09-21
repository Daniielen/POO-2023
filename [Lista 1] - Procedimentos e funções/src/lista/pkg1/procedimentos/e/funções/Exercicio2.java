
package lista.pkg1.procedimentos.e.funções;

import javax.swing.JOptionPane;

/**
 * @author Danielen Santana
 * @details Escreva um procedimento que recebe as 3 notas de um aluno por
 * parâmetro e uma letra. Se a letra for A o procedimento calcula e 
 * imprime a média aritmética das notas do aluno, 
 * se for P, a sua média ponderada (pesos: 5, 3 e 2) 
 * e se for H, a sua média harmônica.

 * @since 20/09/2023
 */

public class Exercicio2 {
    static public void main(String[] args){
        // { ♥ } - Declaração de variáveis 
        float nota_0, nota_1, nota_2,media=0;
        String a, p, h, resposta, mensagem="", op="";
        
        // { ♥ } - Entrada de dados
        resposta = JOptionPane.showInputDialog("Insira 3 notas abaixo:"
                + "\nNota 1: ");
        nota_0 = Integer.parseInt(resposta);
        
        resposta = JOptionPane.showInputDialog("Insira 3 notas abaixo:"
                + "\nNota 2: ");
        nota_1 = Integer.parseInt(resposta);
        
        resposta = JOptionPane.showInputDialog("Insira 3 notas abaixo:"
                + "\nNota 2: ");
        nota_2 = Integer.parseInt(resposta);
        
        resposta = JOptionPane.showInputDialog("Digite uma das opções abaixo:"
                + "\nA) Média Aritmética "
                + "\nB) Média Ponderada "
                + "\nC) Média harmônica");
        
        // { ♥ } - Processamento/Chamada de funções
        switch(resposta){
            case "a": 
               media = m_aritimetica(nota_0, nota_1, nota_2);
               mensagem = "A média aritmetica é "+ media;
            break;
            case "b":
                media = m_ponderada(nota_0, nota_1, nota_2);
                mensagem = "A média ponderada é "+ media;
            break;
            case "c":
                media = m_harmonica(nota_0, nota_1, nota_2);
                mensagem = "A média harmonica é "+ media;
            break;
            default: 
                mensagem = "Opção inválida!";
        }
        
         // { ♥ } - Resultado
        JOptionPane.showMessageDialog(null, mensagem);
       
    }
    static float m_aritimetica(float n_0, float n_1, float n_2){
        float m = 0;
        
        m = (n_0 + n_1 + n_2) / 3;
        
        return m;
    }
    
    static float m_ponderada(float n_0, float n_1, float n_2){
        float m = 0;
        
        m = (n_0*5) + (n_1*3) + (n_2*2) / 5 + 3 + 2;
        
        return m;
    }
    
    static float m_harmonica(float n_0, float n_1, float n_2){
        float m = 0;
        
        m = 3 / ((1/n_0) + (1/n_1) + (1/n_2));
        
        return m;
    }
}
