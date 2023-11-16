package dao;

import java.util.List;
import modelo.Caneta;

//  Resumo do código, apresentável e pode ser comparado a um sumário
public interface CanetaDAO {
    public int inserir(Caneta caneta);
    public int editar(Caneta caneta);
    public int apagar(int id);
    
    // Listar() é polimorfismo
    public List<Caneta> listar(); // Retorna a lista 
    public Caneta listar(int id); // Retorna uma caneta pelo ID
}
