package slide.exemplo.caneta;

import java.util.Scanner;

/**
 *
 * @author Danielen Santana
 * @since 04/10/2023
 * @details Criação da classe Caneta a partir do exemplo demonstrado no slide
 * @note Exemplo criado no curso de Programação Orientada a Objeto 
 * ministrada pelo professor Dr.Fabio Marques.
 */
public class PrincipalCaneta {

    public static void main(String[] args) {
       /*
      Caneta caneta = new Caneta(); // instanciamento
      
      Scanner s = new Scanner(System.in);
      
      System.out.println("Informe o modelo: ");
      caneta.modelo = s.next();
      
      System.out.println("Informe a cor: ");
      caneta.cor = s.next();
      
      System.out.println("Informe a ponta: ");
      caneta.ponta = s.nextFloat();
      
      System.out.println("Informe a carga: ");
      caneta.carga = s.nextInt();
      caneta.tampada = true;
      
      int erro = caneta.tampar();
      if ( erro > 0 )  System.out.println("A caneta já está tampada");
      
      erro = caneta.destampar();
      if( erro > 0 ) System.out.println("A caneta já está destampada!");
      
      System.out.println(caneta.Escrever()); 
      */
      new frmCaneta().setVisible(true);  
    } 
            
            
            
            
    
}
