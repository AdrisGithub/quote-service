package de.wzrd.quoteservice.quotes.entity;

import jakarta.persistence.*;

@Entity
public class Player {
    @Id
    @JoinColumn()
    @ManyToOne
    public Quote quote;
}
