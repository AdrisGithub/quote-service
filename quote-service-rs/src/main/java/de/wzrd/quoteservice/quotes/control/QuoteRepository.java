package de.wzrd.quoteservice.quotes.control;

import de.wzrd.quoteservice.quotes.entity.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface QuoteRepository extends JpaRepository<Quote, UUID> {
}
