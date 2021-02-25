package ru.itsjava.dao;

import ru.itsjava.domain.Notebook;

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
