
package lista.pkg1.procedimentos.e.funções;

import javax.swing.JOptionPane;

/**
 * @author Danielen Santana
 * @details Faça uma função que recebe a média final de um aluno por parâmetro 
 * e retorna o seu conceito, conforme a tabela abaixo, para o programa principal:
 * Nota 		Conceito 
 * de 0,0 a 4,9 	D 
 * de 5,0 a 6,9 	C 
 * de 7,0 a 8,9 	B 
 * de 9,0 a 10,0 	A 
 * @since 20/09/2023
 */
public class Exercicio7 {
    public static void main(String[] args){
        String resposta, mensagem;
        float media_final;
        
        resposta = JOptionPane.showInputDialog("Media final do aluno: ");
        media_final = Float.parseFloat(resposta);
        
        mensagem = tab_conceito(media_final);
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    public static String tab_conceito(float media_final){
        String mensagem = "";
        
        if ( media_final < 0.0 || media_final > 10.0 ){
            mensagem = "Nota inválida!";
        } else {
            if ( media_final <= 4.9 ) {
                mensagem = "Conceito D";
                
            } else if ( media_final <= 6.9 ) {
                mensagem = "Conceito C";
                
            } else if ( media_final <= 8.9 ) {
                mensagem = "Conceito B";
                
            } else {
                mensagem = "Conceito A";
            }
        }
        
        return mensagem;
    }
        
}
