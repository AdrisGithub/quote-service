package de.wzrd.quoteservice.rest;

import de.wzrd.quoteservice.quotes.control.QuoteRepository;
import de.wzrd.quoteservice.quotes.entity.Quote;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;
import java.util.UUID;

@RestController
@RequestScope
@RequiredArgsConstructor
public class QuoteController {
    
    private final QuoteRepository repository;
    private final LoginController loginController;

    @GetMapping("/quotes")
    public ResponseEntity<List<Quote>> getAll() {
        System.out.println(loginController.getId());
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping(value = "/quotes/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Quote get(@PathVariable("id") UUID id) {
        return repository.findById(id).orElse(new Quote());
    }
}
