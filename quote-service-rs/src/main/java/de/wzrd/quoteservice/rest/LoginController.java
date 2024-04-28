package de.wzrd.quoteservice.rest;

import lombok.Getter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.UUID;

@Getter
@SessionScope
@Component
public class LoginController {

    private final UUID id;

    public LoginController() {
        this.id = UUID.randomUUID();
    }
}
