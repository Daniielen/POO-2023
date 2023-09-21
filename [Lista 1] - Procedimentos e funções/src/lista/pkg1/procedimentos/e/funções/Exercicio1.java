package lista.pkg1.procedimentos.e.funções;

import javax.swing.JOptionPane;

/**
 * @author Danielen Santana
 * @details Faça uma função que recebe por parâmetro o raio de uma esfera e 
 * calcula o seu volume (v = 4/3 * π * r3), onde r é o raio da esfera e π 
 * é uma constante igual a 3,14159265.
 * @since 20/09/2023
 */

    
public class Exercicio1 {
    
    public static void main(String[] args){
        // { ♥ } - Declaração de variáveis 
        float pi = (float) 3.14159265;
        float v, r;
        String resposta, mensagem="";
        
        // { ♥ } - Entrada de Dados
        resposta = JOptionPane.showInputDialog(null, "Insira o valor do raio: ");
        r = Integer.parseInt(resposta);
        
        // { ... } - Funções
        v = esfera(r, pi);
        
        // { ♥ } - Resultado
        mensagem = "Resultado: " + v + "m³";
        JOptionPane.showMessageDialog(null, mensagem);
    }
    static float esfera(float r, float pi){
        float volume;
        
        double elevado_3 = Math.pow(r, 3);
        float r_elevado_3 = (float) elevado_3;
        
        volume = (4/3) * (pi * r_elevado_3);
        
        return volume;
    }
}
