package de.wzrd.quoteservice.rest;

import de.wzrd.quoteservice.quotes.control.QuoteRepository;
import de.wzrd.quoteservice.quotes.entity.Quote;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class DatabaseLoader {
    @Bean
    CommandLineRunner initDB(QuoteRepository repository) {
        return args -> {
            log.info("Preloading: {}", repository.save(new Quote("Ich hasse alle", "Joschka sagte einst ich hasse sie alle")));
            log.info("Preloading: {}", repository.save(new Quote("Ich hasse alle", "Joschka sagte einst ich hasse sie alle")));
        };
    }
}
