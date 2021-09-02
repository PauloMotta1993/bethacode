package service;

import model.Diretor;
import util.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DiretorService implements IService<Diretor>{


    @Override
    public Diretor save(Diretor diretor) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement update = conn.prepareStatement("insert into curso.diretor values(?,?,?,?,?)");
        update.setString(1, diretor.getNome());
        update.setString(2, diretor.getCpf());
        update.setDouble(3, diretor.getSalario());
        update.setDouble(4, diretor.getBonus());
        update.setInt(5, diretor.getId());
        update.executeUpdate();
        conn.close();
        return diretor;
    }

    public Diretor update (Diretor diretor) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement update = conn.prepareStatement("UPDATE curso.diretor SET nome = ?, cpf = ?, salario = ?, bonus = ? WHERE id = ?");
        update.setString(1, diretor.getNome());
        update.setString(2, diretor.getCpf());
        update.setDouble(3, diretor.getSalario());
        update.setDouble(4, diretor.getBonus());
        update.setInt(5, diretor.getId());
        update.executeUpdate();
        conn.close();
        return diretor;
    }
        @Override
    public Diretor delete(Diretor diretor) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement statement2 = conn.prepareStatement("DELETE FROM curso.diretor WHERE id = ?");
        statement2.setInt(1, diretor.getId());
        statement2.executeUpdate();
        conn.close();
        return diretor;
    }


    public void findAll() {
    }

    public void findById() {
    }
}

