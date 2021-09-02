package repository;

import model.Diretor;
import util.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DiretorRepository implements IRepository<Diretor> {

    @Override
    public List<Diretor> findAll() throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement statement = conn.prepareStatement("SELECT * FROM curso.diretor ");
        ResultSet resultSet = null;
        resultSet = statement.executeQuery();

        List<Diretor> Diretor = new ArrayList<>();
        System.out.println("BUSCA ID INICIAL");
        while (resultSet.next()) {
            String index = resultSet.getString(1);
            System.out.println(index);
        }
        System.out.println("BUSCA POR ID FINAL");
        conn.close();

        return Diretor;

    }

    @Override
    public Diretor findById(int id) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement statement3 = conn.prepareStatement("SELECT * FROM curso.diretor WHERE id = ?");
        statement3.setInt(1, id);
        ResultSet resultSet3 = null;
        resultSet3 = statement3.executeQuery();

        System.out.println("LISTAGEM INICIAL");
        while (resultSet3.next()) {
            String index = resultSet3.getString(1);
            System.out.println(index);
        }
        System.out.println("LISTAGEM FINAL");
        conn.close();

        return new Diretor();
    }

    }
