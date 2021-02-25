package ru.itsjava.dao;

import ru.itsjava.domain.Notebook;

public interface NotebookDao {
    Notebook getNotebookById(long id);
}
