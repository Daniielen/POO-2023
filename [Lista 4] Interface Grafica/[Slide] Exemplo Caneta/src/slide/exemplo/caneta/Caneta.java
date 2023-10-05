package slide.exemplo.caneta;

/**
 *
 * @author Danielen Santana
 * @since 04/10/2023
 * @details Criação da classe Caneta a partir do exemplo demonstrado no slide
 * @note Exemplo criado no curso de Programação Orientada a Objeto 
 * ministrada pelo professor Dr.Fabio Marques.
 */
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    
    public String Escrever() {
        return "Escrevendo...";
    }
    
    public int tampar() {
        int erro = 0;
        if ( !tampada ) {
            tampada = true;        
        } else {
            erro = 1;
        }
        return erro;
    }
    
    public int destampar() {
        int erro = 0;
        if ( tampada ) {
            tampada = false;        
        } else {
            erro = 1;
        }
        return erro;
    }

    @Override
    public String toString() {
        return "Caneta{" + "modelo=" + modelo + ", cor=" + cor + ", ponta=" + ponta + ", carga=" + carga + ", tampada=" + tampada + '}';
    }
    
}
