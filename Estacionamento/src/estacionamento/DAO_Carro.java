package estacionamento;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.*;
import java.util.*;

public class DAO_Carro {

    private Connection con;

    // construtor
    public DAO_Carro(Connection con) {
        setCon(con);
    }

    // SEt's e GET's
    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public String inserir(BLL_Carro carro) {
        String sql = "insert into carro(placa, cor, descricao) values( ?,  ?,  ?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, carro.getPlaca());
            ps.setString(2, carro.getCor());
            ps.setString(3, carro.getDescricao());
            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso.";
            } else {
                return "Erro ao inserir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public String alterar(BLL_Carro carro) {
        String sql = "update carro set cor = ?,descricao = ?";
        sql += " where placa = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, carro.getCor());
            ps.setString(2, carro.getDescricao());
            ps.setString(3, carro.getPlaca());
            if (ps.executeUpdate() > 0) {
                return "Alterado com sucesso.";
            } else {
                return "Erro ao alterar";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public String excluir(BLL_Carro carro) {
        String sql = "delete from carro where placa = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, carro.getPlaca());
            if (ps.executeUpdate() > 0) {
                return "Excluído com sucesso.";
            } else {
                return "Erro ao excluir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public ArrayList<BLL_Carro> listarTodos() {
        String sql = "select * from carro ";
        ArrayList<BLL_Carro> listaCarro = new ArrayList<BLL_Carro>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    BLL_Carro cb = new BLL_Carro();
                    cb.setPlaca(rs.getString(1));
                    cb.setCor(rs.getString(2));
                    cb.setDescricao(rs.getString(3));
                    listaCarro.add(cb);
                }
                return listaCarro;
            } else {
                return null;
            }
        } catch (SQLException e) {
            return null;
        }
    }
}
