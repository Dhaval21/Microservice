package com.mycompany.myapp.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A BankAccount.
 */
@Entity
@Table(name = "bank_account")
public class BankAccount implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "cards")
    private Integer cards;

    @Column(name = "currency_code")
    private Integer currencyCode;

    @Column(name = "contry_code")
    private Integer contryCode;

    @ManyToOne
    @JsonIgnoreProperties("bankAccounts")
    private Customer customer;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCards() {
        return cards;
    }

    public BankAccount cards(Integer cards) {
        this.cards = cards;
        return this;
    }

    public void setCards(Integer cards) {
        this.cards = cards;
    }

    public Integer getCurrencyCode() {
        return currencyCode;
    }

    public BankAccount currencyCode(Integer currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    public void setCurrencyCode(Integer currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Integer getContryCode() {
        return contryCode;
    }

    public BankAccount contryCode(Integer contryCode) {
        this.contryCode = contryCode;
        return this;
    }

    public void setContryCode(Integer contryCode) {
        this.contryCode = contryCode;
    }

    public Customer getCustomer() {
        return customer;
    }

    public BankAccount customer(Customer customer) {
        this.customer = customer;
        return this;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BankAccount)) {
            return false;
        }
        return id != null && id.equals(((BankAccount) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
            "id=" + getId() +
            ", cards=" + getCards() +
            ", currencyCode=" + getCurrencyCode() +
            ", contryCode=" + getContryCode() +
            "}";
    }
}
