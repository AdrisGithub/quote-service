package de.wzrd.quoteservice.rest;

import de.wzrd.quoteservice.quotes.control.QuoteRepository;
import de.wzrd.quoteservice.quotes.entity.Quote;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class QuoteController {

    private final QuoteRepository repository;

    public QuoteController(QuoteRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/quotes")
    public List<Quote> getAll() {
        return repository.findAll();
    }

    @GetMapping(value = "/quotes/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Quote get(@PathVariable("id") UUID id) {
        return repository.findById(id).orElse(new Quote());
    }
}
