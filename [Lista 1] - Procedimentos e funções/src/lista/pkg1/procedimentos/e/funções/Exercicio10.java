
package lista.pkg1.procedimentos.e.funções;

import javax.swing.JOptionPane;

/**
 * @author Danielen Santana
 * @details Faça um procedimento que recebe um vetor de valores inteiros por 
 * parâmetro e ordena-os em ordem crescente.
 * @since 21/09/2023
 */
public class Exercicio10 {
    public static void main(String[] args) {
        
        String resposta;
        int qtd, indice = 0;
        int []num;
        
        resposta = JOptionPane.showInputDialog("Quantidade de valores a serem preenchidos: ");
        qtd = Integer.parseInt(resposta);
        
        num = new int [qtd];
        
        for (int i = 0; i < num.length; i++){
            indice = i+1; 
            
            resposta = JOptionPane.showInputDialog("[ " + indice + " ]" + "Valor: ");
            
            num[i] = Integer.parseInt(resposta);
        }
        
        ordemCrescente(num,qtd);
    }
    
    public static void ordemCrescente(int num[], int tam) {
        int []num_aux;
        int []num_crescente;
        int num_temp = 0;
        
        num_aux = new int [tam];
        num_crescente = new int [tam];
        
        for (int i = 0; i < num.length; i++) {
            num_aux[i] = num[i];
        }
        
        for (int i = 0; i < num.length; i++){
            
            int qtd = num.length;
            int indice = qtd - 1;
            
            if (num[i] > num_aux[indice]){
                num_crescente[i] = num[i];
                System.out.println("\nnum aux: " + num_aux[indice]);
            } else {
                num_crescente[i] = num [i];
                //System.out.println("else: " + num_crescente[i]);
            }
        }
        
        for (int i = 0; i < num_crescente.length; i++) {
            System.out.println(num_crescente[i]);
        }
    }
}
