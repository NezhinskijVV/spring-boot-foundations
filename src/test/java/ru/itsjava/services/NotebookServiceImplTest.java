package ru.itsjava.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.domain.Notebook;

@DisplayName("Класс NotebookServiceImpl должен: ")
public class NotebookServiceImplTest {

    @DisplayName(" иметь корректный метод getNotebook")
    @Test
    public void shouldHaveCorrectMethodGetNotebook() {
        NotebookService notebookService = new NotebookServiceImpl();
        Assertions.assertEquals(new Notebook("Mac"), notebookService.getNotebook());
    }
}