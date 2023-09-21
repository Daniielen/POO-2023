package lista.pkg1.procedimentos.e.funções;

import javax.swing.JOptionPane;

/**
 * @author Danielen Santana
 * @details Faça um procedimento que recebe a idade de um nadador por parâmetro
 * e imprime a categoria desse nadador de acordo com a tabela abaixo: 
 * Chame atenção do usuário em caso de uma consulta inválida, ou seja, com números
 * menores ou iguais a zero, ou menores do que a quantidade cadastrada.
 *
 *  Idade		 Categoria 
 *  5 a 7 anos 	         Infantil A 
 *  8 a 10 anos 	 Infantil B 
 *  11-13 anos           Juvenil A 
 *  14-17 anos           Juvenil B 
 *  Maiores              de 18 anos (inclusive) Adulto
 * @since 20/09/2023
 */
public class Exercicio5 {
    public static void main(String[] args) {
        int idade;
        String resposta, mensagem = "";
        
        resposta = JOptionPane.showInputDialog("Informe a idade: ");
        idade = Integer.parseInt(resposta);
        
        consulta(idade);
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    static public void consulta(int idade) {
        String mensagem = "";
        if (idade < 5 || idade > 80){
            mensagem = "Idade invalida";
        } else {   
            if (idade <= 7) {
                mensagem = "Categotia: Infantil A";
            } else if (idade <= 10) {
                mensagem = "Categotia: Infantil B";
            } else if (idade <= 13) {
                mensagem = "Categotia: Juvenil A";
            } else if (idade <= 17) {
                mensagem = "Categotia: Juvenil B";
            } else {
                mensagem = "Categotia: Adulto";
            }
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
