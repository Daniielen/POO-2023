/*
 * Com base nos comandos vistos
 * Criar uma calculadora com as 4 operações básicas (+,-, *, /)
 * Conversão String p/ outro tipo parse
 * Integer.p
 * Float.p
 * Double.p
 * Boolean.p
 */
package aula.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * Autora: Danielen Santana     Data: 14/09/2023
 */


public class Calculadora {
    public static void main(String[] args) {
       String resposta;
       int option, n_1, n_2;
       int resultado, check;
       float div_1, div_2, divisao;
        
        do{
           
            resposta = JOptionPane.showInputDialog("\tCalculadora\nEscolha uma opção abaixo: \n1) Adição\n2) Subtração \n3) Multiplicação\n4) Divisão");
            option = Integer.parseInt(resposta);
            switch(option) {
                case 1:
                    resposta = JOptionPane.showInputDialog("Operação escolhida: SOMA\nDigite o primeiro valor: ");
                    n_1 = Integer.parseInt(resposta);

                    resposta = JOptionPane.showInputDialog("Operação escolhida: SOMA\n Digite o segundo valor: ");
                    n_2 = Integer.parseInt(resposta);

                    resultado = n_1 + n_2;

                    JOptionPane.showMessageDialog(null, resultado);
                 break;

                 case 2:
                    resposta = JOptionPane.showInputDialog("Operação escolhida: SUBTRAÇÃO\nDigite o primeiro valor: ");
                    n_1 = Integer.parseInt(resposta);

                    resposta = JOptionPane.showInputDialog("Operação escolhida: SUBTRAÇÃO\n Digite o segundo valor: ");
                    n_2 = Integer.parseInt(resposta);

                    resultado = n_1 - n_2;

                    JOptionPane.showMessageDialog(null, resultado);
                 break;

                 case 3:
                    resposta = JOptionPane.showInputDialog("Operação escolhida: MULTIPLICAÇÃO\nDigite o primeiro valor: ");
                    n_1 = Integer.parseInt(resposta);

                    resposta = JOptionPane.showInputDialog("Operação escolhida: MULTIPLICAÇÃO\nDigite o segundo valor: ");
                    n_2 = Integer.parseInt(resposta);

                    resultado = n_1 * n_2;

                    JOptionPane.showMessageDialog(null, resultado);
                 break;

                 case 4:
                    resposta = JOptionPane.showInputDialog("Operação escolhida: DIVISÃO\nDigite o primeiro valor: ");
                    div_1 = Float.parseFloat(resposta);

                    resposta = JOptionPane.showInputDialog("Operação escolhida: DIVISÃO\nDigite o segundo valor: ");
                    div_2 = Float.parseFloat(resposta);

                    divisao = div_1 / div_2;

                    JOptionPane.showMessageDialog(null, divisao);
                 break;
                 default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida","", 2);
            }
            check = JOptionPane.showConfirmDialog(null, "Deseja continuar calculando?");
            //check = JOptionPane.showInputDialog("Deseja continuar calculando?\nDigite: Sim/Não");
        } while (!(check == JOptionPane.NO_OPTION));
    }
}
