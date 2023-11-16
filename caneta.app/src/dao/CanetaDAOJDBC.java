package dao;

import com.mysql.jdbc.Connection;
import conexao.ConexaoMySQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Caneta;

public class CanetaDAOJDBC implements CanetaDAO {
    
    Connection conexao = null;
    PreparedStatement sql = null;
    ResultSet rset = null;
    
    @Override
    public int inserir(Caneta caneta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int editar(Caneta caneta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int apagar(int id) {
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder
                .append("DELETE FROM caneta ")
                .append("WHERE codigo = ?");
        
        String delete = sqlBuilder.toString();
        
        int linha = 0;
        try {
            conexao = ConexaoMySQL.getConexao();
            
            sql = conexao.prepareStatement(delete);
            sql.setInt(1, id);
            linha = sql.executeUpdate(); // realiza a atualização no banco de dados
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            fecharConexao();
        }
        
        return linha;
    }

    @Override
    public List<Caneta> listar() {
        String select = "SELECT * FROM caneta";

        List<Caneta> canetas = new ArrayList<Caneta>();

        try {
            Connection conexao = ConexaoMySQL.getConexao();

            sql = conexao.prepareStatement(select);

            rset = sql.executeQuery();
           
            while (rset.next()) {

                Caneta caneta = new Caneta();

                caneta.setCodigo(rset.getInt("codigo"));
                caneta.setModelo(rset.getString("modelo"));
                caneta.setCor(rset.getString("cor"));
                caneta.setPonta(rset.getFloat("ponta"));
                caneta.setCarga(rset.getInt("carga"));
                caneta.setTampada(rset.getBoolean("tampada"));

                canetas.add(caneta);

            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fecharConexao();
        }

        return canetas;
    }
    
    
    @Override
    public Caneta listar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void fecharConexao() {
        try {
            if (rset != null) {
                rset.close();
            }
            if (sql != null) {
                sql.close();
            }

            if (conexao != null) {
                conexao.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
