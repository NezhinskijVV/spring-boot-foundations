package ru.itsjava.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.itsjava.dao.NotebookDao;

@SpringBootTest
@DisplayName("Класс ProgrammerServiceImpl должен: ")
public class ProgrammerServiceImplTest {

    @Configuration
    static class MyConfiguration{
        @Bean
        public NotebookService notebookService(){
            return new NotebookServiceImpl();
        }

        @Bean
        public ProgrammerService programmerService(){
            return new ProgrammerServiceImpl(notebookService());
        }
    }

    @Autowired
    ProgrammerService programmerService;

//    @MockBean
//    NotebookDao notebookDao;

    @DisplayName(" корректно возвращать предметы программиста")
    @Test
    public void shouldHaveCorrectGetItems() {
        Assertions.assertEquals(1, programmerService.getItems().size());
    }
}
