package ru.itsjava.dao;

import org.springframework.stereotype.Repository;
import ru.itsjava.domain.Notebook;

//@Repository
public class NotebookDaoImpl implements NotebookDao {

    public NotebookDaoImpl() {
        System.out.println("I NotebookDaoImpl");
    }



    @Override
    public Notebook getNotebookById(long id) {
        //Здесь код по подключению к БД и возвращению ноутбука из нее
        return new Notebook("I'm note from DB");
    }
}
