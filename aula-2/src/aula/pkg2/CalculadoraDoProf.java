package aula.pkg2;
/*
 Classe é dividida em duas partes
 - Atributos
    Variaveis
 - Métodos
   Condicionas
   Loops
*/
import java.util.Scanner;

public class CalculadoraDoProf {

    public static void main(String[] args) {
        // leitura
        Scanner s = new Scanner(System.in);
        loop: do {
            System.out.println("Informe a operação a realizar. Digite: "
                    + "\n+ para somar"
                    + "\n- para subtrair"
                    + "\n* para multiplicar"
                    + "\n/ para dividir");

            char operacao = s.next().charAt(0); 
            System.out.println("Informe o primeiro operando: ");
            float num1 = s.nextFloat();
            System.out.println("Informe o segundo operando: ");
            float num2 = s.nextFloat();
            float resultado;
            // processamento e resultado
            switch (operacao) {
                case '+':
                    resultado = soma(num1,num2);
                    //resultado = num1 + num2;
                    break;
                case '-':
                    resultado = subtracao(num1,num2);
                    break;
                case '*':
                    resultado = multiplicacao(num1,num2);
                    break;
                case '/':
                    resultado = divisao(num1,num2);
                    break;
                default:
                    break loop;
            }
            System.out.println(resultado);
        } while (true);
    }
    
    // criação dos métodos
    static float soma(float n1, float n2){ // não é necessário ter a mesma nomeclatura, somente o mesmo tipo
        return n1 + n2;
    }
    
    static float subtracao(float n1, float n2){ // não é necessário ter a mesma nomeclatura, somente o mesmo tipo
        return n1 - n2;
    }
    
    static float multiplicacao(float n1, float n2){ // não é necessário ter a mesma nomeclatura, somente o mesmo tipo
        return n1 * n2;
    }
    static float divisao(float n1, float n2){ // não é necessário ter a mesma nomeclatura, somente o mesmo tipo
        return n1 / n2;
    }
}
