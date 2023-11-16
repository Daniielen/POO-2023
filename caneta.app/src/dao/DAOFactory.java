package dao;

public class DAOFactory {
    public static CanetaDAO criarCanetaDAO() {
        return new CanetaDAOJDBC(); // instancia a classe implementadora
    }
}
