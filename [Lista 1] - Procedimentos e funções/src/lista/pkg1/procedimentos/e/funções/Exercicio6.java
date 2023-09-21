
package lista.pkg1.procedimentos.e.funções;

import javax.swing.JOptionPane;

/**
 * @author Danielen Santana
 * @details Faça uma função que recebe um valor inteiro e verifica 
 * se o valor é positivo ou negativo. 
 * A função deve retornar um valor booleano para o programa principal 
 * que imprimirá o resultado.
 * @since 20/09/2023
 */

public class Exercicio6 {
    static public void main(String[] args) {
        String resposta, mensagem = "";
        int num;
        
        resposta = JOptionPane.showInputDialog("Informe um valor: ");
        num = Integer.parseInt(resposta);
        
        if (isOperador(num) == true) {
            mensagem = "Valor positivo";
        } else {
            mensagem = "Valor negativo";
        }
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
    public static boolean isOperador(int num){
       if (num > 0) {
           return true;
       } else {
           return false;
       }
    }
}
