package ru.itsjava;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.itsjava.services.ProgrammerService;

@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(MyApplication.class);

        System.out.println(context.getBean(ProgrammerService.class).getItems());
    }
}
