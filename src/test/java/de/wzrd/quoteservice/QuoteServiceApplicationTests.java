package de.wzrd.quoteservice;

import de.wzrd.quoteservice.quotes.control.QuoteRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;

@SpringBootTest
class QuoteServiceApplicationTests {
    @Mock
    private QuoteRepository repository;

    @Test
    void contextLoads() {
        Assertions.assertTrue(true);
        Mockito.when(repository.findAll()).thenReturn(Collections.emptyList());
        Assertions.assertEquals(Collections.emptyList(), repository.findAll());
    }

}
