package main;


import model.Diretor;
import repository.DiretorRepository;
import service.DiretorService;

import java.sql.SQLException;

public class DiretorMain {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Diretor diretor = new Diretor(1, "João Marcos", "01234567890", 5000.00, 15.0);


        DiretorService service = new DiretorService();

        service.save(diretor);

        service.update(diretor);


        DiretorRepository repository = new DiretorRepository();

        service.findAll();


        service.findById();


        }}