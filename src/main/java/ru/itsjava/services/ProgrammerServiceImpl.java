package ru.itsjava.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammerServiceImpl implements ProgrammerService {
    private final NotebookService notebookService;

    public ProgrammerServiceImpl(NotebookService notebookService) {
        this.notebookService = notebookService;
    }

    @Override
    public List<String> getItems() {
        return List.of(notebookService.getNotebook().toString());
    }

    @Override
    public String toString() {
        return "ProgrammerServiceImpl{" +
                "notebookService=" + notebookService +
                '}';
    }
}
