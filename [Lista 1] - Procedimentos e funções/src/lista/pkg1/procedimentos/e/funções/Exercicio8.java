package lista.pkg1.procedimentos.e.funções;

import javax.swing.JOptionPane;

/**
 * @author Danielen Santana
 * @details Faça uma função que recebe, por parâmetro, a altura 
 * e o sexo de uma pessoa e retorna o seu peso ideal. 
 * Para homens, calcular o peso ideal usando a 
 * fórmula peso ideal = 72.7 x alt - 58 e, para mulheres, 
 * peso ideal = 62.1 x alt - 44.7. 
 * @since 20/09/2023
 */
public class Exercicio8 {
    public static void main(String[] args) {
        String resposta, mensagem = "";
        float peso, altura;
        
        resposta = JOptionPane.showInputDialog("Informe a altura: ");
        altura = Float.parseFloat(resposta);
        
        resposta = JOptionPane.showInputDialog("Informe o gênero (feminino/masculino): ");
        
        if (resposta.equalsIgnoreCase("Feminino") || resposta.equalsIgnoreCase("Masculino")) {
            peso = pesoIdeal(altura,resposta);
            mensagem = "O peso ideal é: " + Math.round(peso) + "kg";
        } else {
            mensagem = "Erro: Somente feminino ou masculino!!";
        }
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    public static float pesoIdeal(float alt, String resposta){
        float resultado = 0;
        String genero = resposta;
        
        if (genero.equalsIgnoreCase("Feminino")) {
            resultado = (float) (72.7 * alt - 58);
        } else if (genero.equalsIgnoreCase("Masculino")) {
            resultado = (float) ( 62.1 * alt - 44.7);
        }
        
        return resultado;
    }
}
