package modelo;

import java.util.Objects;

/**
 *
 * @author Danielen Santana
 * @since 04/10/2023
 * @details Criação da classe Caneta a partir do exemplo demonstrado no slide
 * @note Exemplo criado no curso de Programação Orientada a Objeto 
 * ministrada pelo professor Dr.Fabio Marques.
 */
public class Caneta {
    private int codigo;
    private String modelo;
    private String cor;
    private float ponta;
    private int carga;
    private boolean tampada;

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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    public boolean getTampada() {
        return tampada;
    }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.codigo;
        hash = 59 * hash + Objects.hashCode(this.modelo);
        hash = 59 * hash + Objects.hashCode(this.cor);
        hash = 59 * hash + Float.floatToIntBits(this.ponta);
        hash = 59 * hash + this.carga;
        hash = 59 * hash + (this.tampada ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Caneta other = (Caneta) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (Float.floatToIntBits(this.ponta) != Float.floatToIntBits(other.ponta)) {
            return false;
        }
        if (this.carga != other.carga) {
            return false;
        }
        if (this.tampada != other.tampada) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.cor, other.cor)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Caneta{" + "modelo=" + modelo + ", cor=" + cor + ", ponta=" + ponta + ", carga=" + carga + ", tampada=" + tampada + '}';
    }
    
}
