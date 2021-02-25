package ru.itsjava.profiler;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
//@ConditionalOnProperty("app.flag")
@Profile("dev")
public class DevService {

    public DevService() {
        System.out.println("DevService");
    }
}
