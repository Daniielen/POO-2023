/*
 *   Autora: Danielen Santana       Data: 14/09/2023
 *   Aula 2
 */
package aula.pkg2;

import javax.swing.JOptionPane;

public class Aula2 {

    public static void main(String[] args) {
        String nome, mensagem = "";
        int idade;
        //boolean ativa;
        /*
            nome = "Alessandra";
            idade = 18;
            ativa = true;
         */
        /*
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        nome = s.next();
        System.out.println("Digite a idade: ");
        idade = s.nextInt();
        System.out.println("Situação: ");
        ativa = s.nextBoolean();
        */
        nome = JOptionPane.showInputDialog("Digite o nome: ");
        String resposta = JOptionPane.showInputDialog("Digite a idade: "); // Variavel resposta recebe a idade com o tipo string
        idade = Integer.parseInt(resposta); // Converte a variavel resposta de String para inteiro e a variavel idade recebe o valor convertido
        resposta = JOptionPane.showInputDialog("Situação (ativa/inativa): "); // Variavel resposta_1 recebe dois valores true e false com o tipo string
        //ativa = Boolean.parseBoolean(resposta); // Converte a variavel resposta_1 do tipo string para o tipo booleano;
        /*
        if (resposta.equalsIgnoreCase("ativa")) { // Quando é uma cadeia de caracteres, é necessário usar o método para comparar a resposta e checar se é verdadeira
            ativa = true;
        } else if (resposta.equalsIgnoreCase("inativa")){
            ativa = false;
        }
        */
        // sout + tab = System.out.println("");
        //System.out.println("Nome: " + nome);
        //System.out.println("Idade: " + idade);
        
        if (!resposta.equalsIgnoreCase("ativa")) { // é possível utilizar operadores junto com os métodos 
            mensagem = "Nome: " + nome + "\nIdade: " + idade + "\nUsuário inativo no sistema!";
        } else if (idade < 18) {
            mensagem = "Nome: " + nome + "\nIdade: " + idade + "\nPessoa menor de idade! Precisa de um responsável";
        } else {
            mensagem = "Nome: " + nome + "\nIdade: " + idade + "\nPessoa maior de idade!";
        }
        JOptionPane.showMessageDialog(null, mensagem);
        //System.out.println(mensagem);
    }
}
