
package lista.pkg1.procedimentos.e.funções;

import javax.swing.JOptionPane;

/**
 * @author Danielen Santana
 * @details A prefeitura de uma cidade fez uma pesquisa entre os seus habitantes, 
 * coletando dados sobre o salário e número de filhos. 
 * Faça um programa que leia os dados em vetores e crie um procedimento que 
 * imprima a média de salário da população, a média do número de filhos, 
 * o maior salário e o percentual de pessoas com salário até R$550,00. 
 * Obs: O usuário deve informar a  quantidade de entrevistados.
 * @since 21/09/2023
 */

public class Exercicio9 {
    public static void main(String[] args) {
        float []salario;
        int []num_filhos;
        int qtd_entrevistados, indice = 0;
        float m_salarios = 0;
        float m_filhos = 0;
        float maior_salario = 0;
        float p_salario = 0;
        String mensagem = "";
        
        String resposta;
        
        resposta = JOptionPane.showInputDialog("Informe a quantidade entrevistada: ");
        qtd_entrevistados = Integer.parseInt(resposta);
        
        num_filhos = new int [qtd_entrevistados];
        salario = new float [qtd_entrevistados];
        
        for (int i = 0; i < salario.length; i++) {
            indice = i+1;
            
            resposta = JOptionPane.showInputDialog("[ " + indice + " ] " + "Salário: ");
            salario[i] = Float.parseFloat(resposta);
        }
        for (int i = 0; i < num_filhos.length; i++) {
            indice = i+1;
            
            resposta = JOptionPane.showInputDialog("[ " + indice + " ] " + "Número de filhos: ");
            num_filhos[i] = Integer.parseInt(resposta);
        }
        
        m_salarios = media_salario(salario);
        m_filhos = media_filho(num_filhos);
        maior_salario = salario(salario);
        p_salario = porcentagem_salario(salario);
        mensagem = "\t***** Resultado da Pesquisa realizada pela Prefeitura *****"
                + "\n-> Media dos salarios: R$" + m_salarios 
                + "\n-> Media dos filhos: " + m_filhos 
                + "\n-> Maior salario: " + maior_salario
                + "\n-> Percentual de salarios até R$550,00: " + p_salario+"%"
                + "\n-> Total de entrevistados: " + qtd_entrevistados;
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    public static float media_salario(float salario_tam[]) {
        float m = 0;
        float somatorio = 0;
        float cont = 0;
        
        for (int i = 0; i < salario_tam.length; i++) {
            somatorio += salario_tam[i];
            cont++;
        }
        
        // calculo da média
        m = somatorio / cont;
        
        return m;
    }
    
    public static float media_filho(int filho_tam[]) {
        float m = 0;
        float somatorio = 0;
        float cont = 0;
        
        for (int i = 0; i < filho_tam.length; i++) {
            somatorio += filho_tam[i];
            cont++;
        }
        
        // calculo da média
        m = somatorio / cont;
        
        return m;
    }
    
    public static float salario(float salario[]) {
        float maior_salario = 0;
        float salario_temp = 0;
        for (int i = 0; i < salario.length; i++) {
            
            if (salario[i] > salario_temp) {
                maior_salario = salario[i];
            } else {
                maior_salario = salario_temp;
            }
            
            salario_temp = salario[i];
        }
        return maior_salario;
    }
    
    public static float porcentagem_salario(float salario[]) {
        float somatorio_salario = 0;
        int cont_salario_550 = 0;
        int cont_salario_total = 0;
        float percentual = 0;
        for (int i = 0; i < salario.length; i++) {
            if (salario[i] > 0 && salario[i] <= 550) {
                cont_salario_550++;
            }
            cont_salario_total++;
        }
        percentual = (cont_salario_550 * 100) / cont_salario_total;
        System.out.println(percentual);
        return percentual;
    }
}
