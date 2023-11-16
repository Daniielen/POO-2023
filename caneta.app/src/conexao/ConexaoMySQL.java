/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author aluno
 */
public class ConexaoMySQL {
    private static final String USUARIO = "root";
    private static final String SENHA = "123456";
    private static final String URL_BANCO = "jdbc:mysql://localhost:3306/papelaria";
    
    // Só poderá ser criada uma vez, e existir somente uma instancia
    public static Connection getConexao() throws Exception {
        //Faz com que a classe seja carregada pela JVM
        Class.forName("com.mysql.jdbc.Driver");

        //Cria a conexao com o banco de dados
        return (Connection) DriverManager.getConnection(URL_BANCO, USUARIO, SENHA);

    }
}
