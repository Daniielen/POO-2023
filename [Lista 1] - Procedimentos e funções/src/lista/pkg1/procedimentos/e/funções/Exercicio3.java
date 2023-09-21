
package lista.pkg1.procedimentos.e.funções;

import javax.swing.JOptionPane;

/**
 * @author Danielen Santana
 * @details Faça uma função que recebe por parâmetro um valor inteiro e positivo 
 * e retorna o valor lógico Verdadeiro caso o valor seja primo e Falso em caso contrário.  
 * O programa principal imprimirá o texto “O Número é Primo”, caso a função retorne verdadeiro.
 * @since 20/09/2023
 */
public class Exercicio3 {
    static public void main(String[] args){
        String resposta, mensagem = "";
        int num;
        boolean check;
        resposta = JOptionPane.showInputDialog("Insira um valor: ");
        num = Integer.parseInt(resposta);
        
        if (!(num > 0)) {
            mensagem = "Insira um valor positivo!";
        } else {
            if (!(isPrimo(num))) {
                mensagem = "Não é numero primo.";
            } else {
                mensagem = "O Número é Primo";
            }
        }
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
    static boolean isPrimo(int num){
        int cont_div = 0;
        for (int i=1; i <= num; i++){
            if (num % i == 0) {
                cont_div++;
            }
        }
        if (cont_div == 2) {
                return true;
        }
        return false;
    }
}
