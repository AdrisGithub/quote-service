package de.wzrd.quoteservice.quotes.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
public class Quote {
    @Id
    @GeneratedValue
    private UUID id;
    private String title;
    private String detail;

    public Quote(String title, String detail) {
        this.title = title;
        this.detail = detail;
    }

}
