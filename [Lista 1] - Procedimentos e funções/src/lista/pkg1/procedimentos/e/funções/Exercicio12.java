
package lista.pkg1.procedimentos.e.funções;

import javax.swing.JOptionPane;

/**
 * @author Danielen Santana
 * @details Faça uma função que recebe um vetor X(15) de inteiros ,
 * por parâmetro, e retorna a quantidade de valores pares em X.
 * @since 21/09/2023
 */
public class Exercicio12 {
    public static void main(String[] args) {
        int []valores;
        String resposta, mensagem;
        int qtd_num_pares, num;
        valores = new int [5];
        
        for (int i = 0; i < valores.length; i++) {
            resposta = JOptionPane.showInputDialog("[" + (i+1) + "] Insira o valor: ");
            valores[i] = Integer.parseInt(resposta);
        }
        qtd_num_pares = numeros_pares(valores, valores.length);
        
        mensagem = "Valores inseridos:\n" ;
        for (int i = 0; i < valores.length; i++) {
            mensagem += valores[i] + "   ";
        }
        mensagem += "\nQuantidade de valores pares:\n" + qtd_num_pares;
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    public static int numeros_pares(int []num, int tam) {
        int cont_par = 0;
        for (int i = 0; i < tam; i++) {
            if (num[i] % 2 == 0) {
                cont_par++;
            }
        }
        return cont_par;
    }
}