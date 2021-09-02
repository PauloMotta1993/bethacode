package main;

import model.Funcionario;
import repository.FuncionarioRepository;
import service.FuncionarioService;
import java.sql.SQLException;

public class FuncionarioMain {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {


        Funcionario funcionario = new Funcionario(1, "Paulo Motta", "08348016988", 1800.00);


        FuncionarioService service = new FuncionarioService();

        service.save(funcionario);

        service.update(funcionario);


        FuncionarioRepository repository = new FuncionarioRepository();

        repository.findAll();

        repository.findById(7);

    }

}