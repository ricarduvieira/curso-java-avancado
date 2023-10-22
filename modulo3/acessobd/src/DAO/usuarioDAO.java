package DAO;


import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.conexao;
import entidades.usuario;

public class usuarioDAO {
    public void cadastrarusuario (usuario usuario) {
        String sql = "INSERT INTO PESSOA (NAME, SEXO, EMAIL) VALUES (?, ?, ?)";

        PreparedStatement ps = null;
        try {
            ps = conexao.getConexao().prepareStatement(sql)
            ps.setString(1, usuario.getName());
            ps.setString(2, usuario.getSexo());
            ps.setString(3, usuario.getEmail());

            ps.execute();
            ps.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
