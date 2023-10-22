import DAO.usuarioDAO;
import entidades.usuario;

public class App {
    public static void main(String[] args) throws Exception {
        
        usuario u = new usuario();
        u.setName("RICARDO");
        u.setSexo("M");
        u.setEmail("RICARDO@RICARDO.COM");

        new usuarioDAO().cadastrarusuario(u);

    }
}
